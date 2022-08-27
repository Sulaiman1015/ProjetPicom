package fr.orsys.as.ProjetPicom.service.impl;

import fr.orsys.as.ProjetPicom.dao.ZoneDao;
import fr.orsys.as.ProjetPicom.service.ZoneService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ZoneServiceImpl implements ZoneService {
    private ZoneDao zoneDao;
}
