package fr.orsys.as.ProjetPicom.business;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Annonce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dateHeureCreation;
    private LocalDateTime dateHeureDebut;
    private LocalDateTime dateHeureFin;
    private String contenu;
    private String numeroCarte;
    private int anneExpiration;
    private byte moisExpiration;
    private String cryptogramme;
    private double montantRegleEnEuros;
    @OneToMany(mappedBy = "annonce", cascade = CascadeType.REMOVE)
    private List<Zone> zones;

}