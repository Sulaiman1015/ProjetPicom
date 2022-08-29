package fr.orsys.as.ProjetPicom.dao;

import fr.orsys.as.ProjetPicom.business.TrancheHoraire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrancheHoraireDao extends JpaRepository<TrancheHoraire,Long> {
}
