package fr.orsys.as.ProjetPicom.service.impl;

import fr.orsys.as.ProjetPicom.business.TrancheHoraire;
import fr.orsys.as.ProjetPicom.dao.TrancheHoraireDao;
import fr.orsys.as.ProjetPicom.service.TrancheHoraireService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class TrancheHoraireServiceImpl implements TrancheHoraireService {

    private final TrancheHoraireDao trancheHoraireDao;

    @Override
    public Optional<TrancheHoraire> findTrancheHoraireById(Long id) {
        return trancheHoraireDao.findById(id);
    }
}
