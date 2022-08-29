package fr.orsys.as.ProjetPicom.service.impl;

import fr.orsys.as.ProjetPicom.business.Arret;
import fr.orsys.as.ProjetPicom.business.Tarif;
import fr.orsys.as.ProjetPicom.dao.TarifDao;
import fr.orsys.as.ProjetPicom.service.TarifService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;

@AllArgsConstructor
@Service
public class TarifServiceImpl implements TarifService {
    private final TarifDao tarifDao;


    @Override
    public Tarif getTarif(Long zoneId) {
        return tarifDao.findByZoneId(zoneId);
    }
}
