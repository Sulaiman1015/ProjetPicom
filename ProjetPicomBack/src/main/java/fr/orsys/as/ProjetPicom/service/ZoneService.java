package fr.orsys.as.ProjetPicom.service;

import fr.orsys.as.ProjetPicom.business.Zone;

import java.util.List;
import java.util.Optional;

public interface ZoneService {
    List<Zone> findAllZones();
    Optional<Zone> findZoneById(Long id);
}
