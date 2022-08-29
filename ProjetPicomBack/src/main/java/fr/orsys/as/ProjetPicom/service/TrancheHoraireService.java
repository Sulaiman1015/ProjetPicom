package fr.orsys.as.ProjetPicom.service;

import fr.orsys.as.ProjetPicom.business.TrancheHoraire;

import java.util.Optional;

public interface TrancheHoraireService {
    Optional<TrancheHoraire> findTrancheHoraireById(Long id);
}
