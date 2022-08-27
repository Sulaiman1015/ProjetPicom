package fr.orsys.as.ProjetPicom.service.impl;

import fr.orsys.as.ProjetPicom.dao.TarifDao;
import fr.orsys.as.ProjetPicom.service.TarifService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class TarifServiceImpl implements TarifService {
    private final TarifDao tarifDao;

}
