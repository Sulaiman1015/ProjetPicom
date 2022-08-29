package fr.orsys.as.ProjetPicom.dao;

import fr.orsys.as.ProjetPicom.business.Zone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneDao extends JpaRepository<Zone, Long> {
}
