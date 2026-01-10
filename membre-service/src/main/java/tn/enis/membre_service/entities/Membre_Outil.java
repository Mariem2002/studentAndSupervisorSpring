package tn.enis.membre_service.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Membre_Outil {
	@EmbeddedId
	private Membre_Outil_Id id;
	@ManyToOne @MapsId("createurId")
	private Membre createur;
}
