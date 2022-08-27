package fr.orsys.as.ProjetPicom.service;

import fr.orsys.as.ProjetPicom.business.Client;
import fr.orsys.as.ProjetPicom.business.Utilisateur;


public interface UtilisateurService {
    Utilisateur authService(String email, String motDePassse);
    Client inscriptService(Client client);
}
