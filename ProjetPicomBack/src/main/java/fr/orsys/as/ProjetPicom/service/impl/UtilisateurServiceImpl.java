package fr.orsys.as.ProjetPicom.service.impl;

import fr.orsys.as.ProjetPicom.business.Administrateur;
import fr.orsys.as.ProjetPicom.business.Client;
import fr.orsys.as.ProjetPicom.business.Utilisateur;
import fr.orsys.as.ProjetPicom.dao.AdministrateurDao;
import fr.orsys.as.ProjetPicom.dao.ClientDao;
import fr.orsys.as.ProjetPicom.dao.UtilisateurDao;
import fr.orsys.as.ProjetPicom.service.UtilisateurService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UtilisateurServiceImpl implements UtilisateurService, UserDetailsService {

    private final UtilisateurDao utilisateurDao;
    private final AdministrateurDao administrateurDao;
    private final ClientDao clientDao;
    private final PasswordEncoder passwordEncoder;


    @Override
    public Utilisateur authService(String email, String motDePassse) {
        return utilisateurDao.findByEmailAndMotDePassse(email, motDePassse);
    }

    @Override
    public Client inscriptService(Client client) {

        if(utilisateurDao.findByEmail(client.getEmail()) != null) {
            return null;
        }else {
            Client newClient = new Client();
            newClient.setNom(client.getNom());
            newClient.setPrenom(client.getPrenom());
            newClient.setEmail(client.getEmail());
            newClient.setMotDePassse(passwordEncoder.encode(client.getMotDePassse()));
            newClient.setNumeroDeTelephone(client.getNumeroDeTelephone());
            utilisateurDao.save(newClient);
            return client;
        }
    }

    @Override
    public Client trouverClient(String clientId) {
        return (Client) utilisateurDao.findClientById(clientId);
    }

    @Override
    public Client getClient(String email, String motDePassse) {
        return clientDao.findByEmailAndMotDePassse(email,motDePassse);
    }

    @Override
    public Administrateur getAdmin(String email, String motDePassse) {
        return administrateurDao.findByEmailAndMotDePassse(email, motDePassse);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        List<GrantedAuthority> auths= AuthorityUtils.commaSeparatedStringToAuthorityList("role");
        return new User("admin1@orsys.fr",new BCryptPasswordEncoder().encode("12345678"),auths);

    }



}
