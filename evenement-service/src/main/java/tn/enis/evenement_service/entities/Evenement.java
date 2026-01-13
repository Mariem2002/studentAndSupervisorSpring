package tn.enis.evenement_service.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@NoArgsConstructor @RequiredArgsConstructor @AllArgsConstructor
@Data @Builder
public class Evenement {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NonNull
	private String titre;
	@NonNull @Temporal(TemporalType.DATE)
	private Date dateEvenement;
	@NonNull
	private String lieu;
	@NonNull
	private long idOrganisateur;
}
