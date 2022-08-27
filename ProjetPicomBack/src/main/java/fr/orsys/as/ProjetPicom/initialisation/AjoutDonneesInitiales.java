package fr.orsys.as.ProjetPicom.initialisation;

import fr.orsys.as.ProjetPicom.business.Administrateur;
import fr.orsys.as.ProjetPicom.business.Annonce;
import fr.orsys.as.ProjetPicom.business.Arret;
import fr.orsys.as.ProjetPicom.business.Client;
import fr.orsys.as.ProjetPicom.business.TrancheHoraire;
import fr.orsys.as.ProjetPicom.business.Zone;
import fr.orsys.as.ProjetPicom.dao.AnnonceDao;
import fr.orsys.as.ProjetPicom.dao.ArretDao;
import fr.orsys.as.ProjetPicom.dao.TrancheHoraireDao;
import fr.orsys.as.ProjetPicom.dao.UtilisateurDao;
import fr.orsys.as.ProjetPicom.dao.ZoneDao;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AjoutDonneesInitiales implements CommandLineRunner {

    private final ZoneDao zoneDao;
    private final ArretDao arretDao;
    private final TrancheHoraireDao trancheHoraireDao;
    private final UtilisateurDao utilisateurDao;
    private final AnnonceDao annonceDao;


    @Override
    public void run(String... args) throws Exception {
        ajouterClients();
        ajouterAdministrateurs();
        ajouterZones();
        ajouterArrets();
        ajouterTranchesHoraires();
        //ajouterAnnonces();
    }


    private void ajouterTranchesHoraires() {
        for (int i = 6; i <=20; i++) {
            TrancheHoraire trancheHoraire = new TrancheHoraire();
            trancheHoraire.setDebut(i);
            trancheHoraireDao.save(trancheHoraire);
        }
    }

    private void ajouterArrets() {
        for( int i=1; i<=20; i++ ) {
            for( int j=0; j<5; ++j){
                Arret arret = new Arret();
                arret.setNom("Arret " + i);
                arret.setLongitude(i);
                arret.setLatitude(i);
                arret.setZone(zoneDao.findAll().get(j));
                arretDao.save(arret);
            }

        }

    }

    private void ajouterZones() {
        for (int i=1; i<=5; i++){
            Zone zone = new Zone();
            zone.setNom("Zone "+i );
            zoneDao.save(zone);
        }
    }

    private void ajouterClients() {
        Client client = new Client();
        client.setNom("MMT");
        client.setPrenom("Sulaiman");
        client.setEmail("client1@orsys.fr");
        client.setMotDePassse("12345678");
        client.setNumeroDeTelephone("0627216923");
        utilisateurDao.save(client);
    }

    private void ajouterAdministrateurs() {
        Administrateur administrateur = new Administrateur();
        administrateur.setNom("Delpierre");
        administrateur.setPrenom("Anthony");
        administrateur.setEmail("admin1@orsys.fr");
        administrateur.setMotDePassse("12345678");
        utilisateurDao.save(administrateur);
    }
}
