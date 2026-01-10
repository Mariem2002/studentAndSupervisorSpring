package tn.enis.membre_service.beans;

import java.util.Date;
import lombok.Data;

@Data

public class EvenementBean {
	private long id;
	private String titre;
	private Date dateEvenement;
	private String lieu;
}
