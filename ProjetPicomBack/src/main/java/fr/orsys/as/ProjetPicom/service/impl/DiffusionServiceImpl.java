package fr.orsys.as.ProjetPicom.service.impl;

import fr.orsys.as.ProjetPicom.dao.DiffusionDao;
import fr.orsys.as.ProjetPicom.service.DiffusionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class DiffusionServiceImpl implements DiffusionService {
    private DiffusionDao diffusionDao;
}
