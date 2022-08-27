package fr.orsys.as.ProjetPicom.dao;

import fr.orsys.as.ProjetPicom.business.Annonce;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnonceDao extends JpaRepository<Annonce, Long> {
}
