package fr.orsys.as.ProjetPicom.business;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Client extends Utilisateur{
    private String numeroDeTelephone;
}
