package fr.orsys.as.ProjetPicom.dao;

import fr.orsys.as.ProjetPicom.business.Arret;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArretDao extends JpaRepository<Arret, Long> {
}
