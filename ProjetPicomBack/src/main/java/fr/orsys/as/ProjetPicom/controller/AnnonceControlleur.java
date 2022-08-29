package fr.orsys.as.ProjetPicom.controller;

import fr.orsys.as.ProjetPicom.business.Annonce;
import fr.orsys.as.ProjetPicom.business.Client;
import fr.orsys.as.ProjetPicom.business.TrancheHoraire;
import fr.orsys.as.ProjetPicom.business.Utilisateur;
import fr.orsys.as.ProjetPicom.business.Zone;
import fr.orsys.as.ProjetPicom.dto.AnnonceDto;
import fr.orsys.as.ProjetPicom.service.AnnonceService;
import fr.orsys.as.ProjetPicom.service.TrancheHoraireService;
import fr.orsys.as.ProjetPicom.service.UtilisateurService;
import fr.orsys.as.ProjetPicom.service.ZoneService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class AnnonceControlleur {

    private final AnnonceService annonceService;
    private final UtilisateurService utilisateurService;
    private final AnnonceDto annonceDto;
    private final ZoneService zoneService;
    private final TrancheHoraireService trancheHoraireService;

    @GetMapping("/admin/annonces")//feature 3
    public List<Annonce> getAnnoncesClient(@RequestParam String clientId){
        return annonceService.recupererAnnoncesClient(clientId);
    }

    //feature 4
    @PostMapping("/client/annonce")
    public Annonce addAnnonce(String clientId){
        Client client = utilisateurService.trouverClient(clientId);
        if(client != null){
            Annonce annonce = new Annonce();
            annonce.setClient(client);
            annonce.setDateHeureCreation(LocalDateTime.now());
            annonce.setContenu(annonceDto.getContenu());
            annonce.setDateHeureDebut(annonceDto.getDateHeureDebut());
            annonce.setDateHeureFin(annonceDto.getDateHeureFin());
            annonce.setNumeroCarte(annonceDto.getNumeroCarte());
            annonce.setMoisExpiration(annonceDto.getMoisExpiration());
            annonce.setAnneExpiration(annonceDto.getAnneExpiration());
            annonce.setCryptogramme(annonceDto.getCryptogramme());
            annonce.setMontantRegleEnEuros(annonceDto.getMontantRegleEnEuros());

            List<Zone> zones = new ArrayList<>();
            for (int i = 0; i < annonceDto.getIdZones().size(); i++) {
                Optional<Zone> zoneOpt = zoneService.findZoneById(annonceDto.getIdZones().get(i));
                if (zoneOpt.isPresent()) {
                    Zone zone = zoneOpt.get();
                    zones.add(zone);
                }
            }

            annonce.setZones(zones);

            List<TrancheHoraire> tranchesHoraires = new ArrayList<>();

            for (int i = 0; i < annonceDto.getIdTranchesHoraires().size(); i++) {
                Optional<TrancheHoraire> trancheHoraireOpt = trancheHoraireService.findTrancheHoraireById(annonceDto.getIdTranchesHoraires().get(i));
                if (trancheHoraireOpt.isPresent()) {
                    TrancheHoraire trancheHoraire = trancheHoraireOpt.get();
                    tranchesHoraires.add(trancheHoraire);
                }
            }

            annonce.setTranchesHoraires(tranchesHoraires);

            return annonceService.addAnnonce(annonce);

        }
        return null;
    }

}
