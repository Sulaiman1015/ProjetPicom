package fr.orsys.as.ProjetPicom.controller;


import fr.orsys.as.ProjetPicom.business.Administrateur;
import fr.orsys.as.ProjetPicom.business.Client;
import fr.orsys.as.ProjetPicom.business.Utilisateur;
import fr.orsys.as.ProjetPicom.service.UtilisateurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class UtilisateurControlleur {

    @Resource
    private UtilisateurService utilisateurService;

    @PostMapping("/inscription") //feature 1
    public Client inscriptUtilisateur(@RequestBody Client client){
        return utilisateurService.inscriptService(client);
    }

    @PostMapping("/auth/client") //feature 2
    public Client authClient(@RequestParam String email, @RequestParam String motDePassse) {
        Client  client = (Client) utilisateurService.authService(email, motDePassse);
        if(client.getNumeroDeTelephone() != null){
            return client;
        }
        return null;
    }

    @PostMapping("/auth/admin") //feature 2
    public Administrateur authAdmin(@RequestParam String email, @RequestParam String motDePassse) {
        Administrateur admin = (Administrateur) utilisateurService.authService(email, motDePassse);
        String numeroDeTelephone = "";
        if(numeroDeTelephone == null){
            return admin;
        }
        return null;
    }



}
