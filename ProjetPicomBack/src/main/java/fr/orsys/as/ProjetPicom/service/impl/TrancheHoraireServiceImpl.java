package fr.orsys.as.ProjetPicom.service.impl;

import fr.orsys.as.ProjetPicom.dao.TrancheHoraireDao;
import fr.orsys.as.ProjetPicom.service.TrancheHoraireService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class TrancheHoraireServiceImpl implements TrancheHoraireService {

    private final TrancheHoraireDao trancheHoraireDao;

}
