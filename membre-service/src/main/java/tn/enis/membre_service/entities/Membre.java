package tn.enis.membre_service.entities;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import tn.enis.membre_service.beans.EvenementBean;
import tn.enis.membre_service.beans.OutilBean;
import tn.enis.membre_service.beans.PublicationBean;
@NoArgsConstructor
@Getter @Setter  // ou @Data
@FieldDefaults(level=AccessLevel.PRIVATE) //passe tous les champs en private
@Entity@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_mbr", discriminatorType=DiscriminatorType.STRING,length=3)
public abstract class Membre {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) //means the database itself is responsible for generating the primary key values, usually by using an auto-increment column
	long id;
	String cin;
	String nom;
	String prenom;
	@Temporal(TemporalType.DATE) //stores only the date (year, month, day). Time is ignored.
	Date dateNaissance;
	@Temporal(TemporalType.DATE) 
	Date dateInscription;
	byte[] photo;
	String cv;
	String email;
	String password;
	String etablissement;
	@Transient
	List<PublicationBean> pubs;
	@Transient
	List<EvenementBean> events;
	@Transient
	List<OutilBean> outils;
	 @Transient
	 public String getTypeMbr() {
	     DiscriminatorValue val = this.getClass().getAnnotation(DiscriminatorValue.class);
	     return val != null ? val.value() : null;
	 }
	 

	public Membre(String cin, String nom, String prenom, Date dateNaissance, String cv, String email, String password, Date dateInscription, String etablissement) {
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.dateInscription = dateInscription;
		this.dateNaissance = dateNaissance;
		this.etablissement = etablissement;
	}
}
