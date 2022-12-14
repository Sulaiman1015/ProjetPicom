package fr.orsys.as.ProjetPicom.business;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Zone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @ManyToOne
    private Annonce annonce;
    @OneToMany(mappedBy = "zone", cascade = CascadeType.REMOVE)
    private List<Arret> arrets;
}