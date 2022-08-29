package fr.orsys.as.ProjetPicom.dao;

import fr.orsys.as.ProjetPicom.business.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDao extends JpaRepository<Client, Long> {
    Client findByEmailAndMotDePassse(String email,String motDePassse);
}
