package tn.enis.membre_service.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import tn.enis.membre_service.beans.EvenementBean;
import tn.enis.membre_service.beans.OutilBean;
import tn.enis.membre_service.beans.PublicationBean;

@RequiredArgsConstructor
@NoArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE) //passe tous les champs en private
@Getter @Setter
@Entity@DiscriminatorValue("ens")
public class EnseignantChercheur extends Membre {
	@NonNull
	String grade;
	@Builder
	public EnseignantChercheur(String cin, String nom, String prenom, Date dateNaissance, String cv, String email, String password, Date dateInscription, String grade, String etablissement) {
		super(cin, nom, prenom, dateNaissance, cv, email, password, dateInscription, etablissement);
		// TODO Auto-generated constructor stub
		this.grade = grade;
	}
}
