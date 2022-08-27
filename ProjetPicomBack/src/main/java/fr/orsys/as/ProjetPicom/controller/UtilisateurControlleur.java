package fr.orsys.as.ProjetPicom.controller;


import fr.orsys.as.ProjetPicom.business.Client;
import fr.orsys.as.ProjetPicom.business.Utilisateur;
import fr.orsys.as.ProjetPicom.service.UtilisateurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class UtilisateurControlleur {

    @Resource
    private UtilisateurService utilisateurService;

    @PostMapping("inscription") //feature 1
    public Client inscriptUtilisateur(@RequestBody Client client){
        return utilisateurService.inscriptService(client);
    }

    @PostMapping("authentication") //feature 2
    public Utilisateur authUtilisateur(@RequestParam String email, @RequestParam String motDePassse) {
        return utilisateurService.authService(email, motDePassse);
    }



}
