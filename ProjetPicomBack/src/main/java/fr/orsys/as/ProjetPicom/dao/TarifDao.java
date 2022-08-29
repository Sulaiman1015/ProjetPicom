package fr.orsys.as.ProjetPicom.dao;

import fr.orsys.as.ProjetPicom.business.Tarif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarifDao extends JpaRepository<Tarif,Long> {
    Tarif findByZoneId(Long zoneId);
}
