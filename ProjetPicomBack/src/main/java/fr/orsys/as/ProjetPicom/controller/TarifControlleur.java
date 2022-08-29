package fr.orsys.as.ProjetPicom.controller;

import fr.orsys.as.ProjetPicom.business.Tarif;
import fr.orsys.as.ProjetPicom.business.Zone;
import fr.orsys.as.ProjetPicom.dto.TarifDto;
import fr.orsys.as.ProjetPicom.service.TarifService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class TarifControlleur {
    private final TarifService tarifService;
    private final TarifDto tarifDto;

    @PostMapping("/admin/tarif")
    public Tarif showTarif(@RequestParam Long zoneId){
        zoneId = tarifDto.getZoneId();
        return tarifService.getTarif(zoneId);
    }
}
