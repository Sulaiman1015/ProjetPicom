package fr.orsys.as.ProjetPicom.service;

import fr.orsys.as.ProjetPicom.business.Annonce;

import java.util.List;

public interface AnnonceService {
    Annonce addAnnonce(Annonce annonce);
    List<Annonce> recupererAnnonces();
    List<Annonce> recupererAnnoncesClient(String clientId);

}
