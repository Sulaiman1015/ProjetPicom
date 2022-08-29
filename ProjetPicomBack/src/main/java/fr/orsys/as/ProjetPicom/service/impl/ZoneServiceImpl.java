package fr.orsys.as.ProjetPicom.service.impl;

import fr.orsys.as.ProjetPicom.business.Zone;
import fr.orsys.as.ProjetPicom.dao.ZoneDao;
import fr.orsys.as.ProjetPicom.service.ZoneService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ZoneServiceImpl implements ZoneService {
    private ZoneDao zoneDao;

    @Override
    public List<Zone> findAllZones() {
        return zoneDao.findAll();
    }

    @Override
    public Optional<Zone> findZoneById(Long id) {
        return zoneDao.findById(id);
    }
}
