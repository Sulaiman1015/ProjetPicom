package fr.orsys.as.ProjetPicom.business;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Client extends Utilisateur{
    private String numeroDeTelephone;
    private List<Annonce> annonces;
}
