package fr.orsys.as.ProjetPicom.dao;

import fr.orsys.as.ProjetPicom.business.Zone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZoneDao extends JpaRepository<Zone, Long> {
}
