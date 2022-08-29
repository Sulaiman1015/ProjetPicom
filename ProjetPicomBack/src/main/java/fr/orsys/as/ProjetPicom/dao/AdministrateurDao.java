package fr.orsys.as.ProjetPicom.dao;

import fr.orsys.as.ProjetPicom.business.Administrateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministrateurDao extends JpaRepository<Administrateur, Long> {
    Administrateur findByEmailAndMotDePassse(String email,String motDePassse);
}
