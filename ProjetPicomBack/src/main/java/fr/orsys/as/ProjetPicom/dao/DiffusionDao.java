package fr.orsys.as.ProjetPicom.dao;

import fr.orsys.as.ProjetPicom.business.Diffusion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiffusionDao extends JpaRepository<Diffusion, Long> {
}
