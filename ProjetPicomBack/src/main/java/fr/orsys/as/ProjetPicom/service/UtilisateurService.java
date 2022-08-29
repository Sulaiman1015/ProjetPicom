package fr.orsys.as.ProjetPicom.service;

import fr.orsys.as.ProjetPicom.business.Administrateur;
import fr.orsys.as.ProjetPicom.business.Client;
import fr.orsys.as.ProjetPicom.business.Utilisateur;


public interface UtilisateurService {
    Utilisateur authService(String email, String motDePassse);
    Client inscriptService(Client client);
    Client trouverClient(String clientId);
    Client getClient(String email, String motDePassse);
    Administrateur getAdmin(String email, String motDePassse);
}
