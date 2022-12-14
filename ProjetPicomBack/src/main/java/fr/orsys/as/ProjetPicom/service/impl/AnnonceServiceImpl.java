package fr.orsys.as.ProjetPicom.service.impl;
import fr.orsys.as.ProjetPicom.business.Annonce;
import fr.orsys.as.ProjetPicom.dao.AnnonceDao;
import fr.orsys.as.ProjetPicom.service.AnnonceService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class AnnonceServiceImpl implements AnnonceService {

    private AnnonceDao annonceDao;

    @Override
    public List<Annonce> recupererAnnonces() {
        return annonceDao.findAll();
    }
}
