package fr.orsys.as.ProjetPicom.dao;

import fr.orsys.as.ProjetPicom.business.Tarif;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarifDao extends JpaRepository<Tarif,Long> {
}
