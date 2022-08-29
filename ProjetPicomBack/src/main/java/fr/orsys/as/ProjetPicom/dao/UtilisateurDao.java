package fr.orsys.as.ProjetPicom.dao;

import fr.orsys.as.ProjetPicom.business.Client;
import fr.orsys.as.ProjetPicom.business.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurDao extends JpaRepository<Utilisateur,Long> {
    Utilisateur findByEmailAndMotDePassse(String email,String motDePassse);
    Utilisateur findByEmail(String email);
    Utilisateur findClientById(String clientId);

}
