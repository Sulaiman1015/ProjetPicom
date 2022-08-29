package fr.orsys.as.ProjetPicom.service;

import fr.orsys.as.ProjetPicom.business.Tarif;
import fr.orsys.as.ProjetPicom.business.Zone;

public interface TarifService {
    Tarif getTarif(Long zoneId);
}
