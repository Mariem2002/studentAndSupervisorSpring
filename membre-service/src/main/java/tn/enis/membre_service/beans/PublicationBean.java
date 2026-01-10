package tn.enis.membre_service.beans;

import java.util.Date;

import lombok.Data;

@Data 
public class PublicationBean
{
	private Long id;
	private String titre;
	private String type;
	private Date dateApparition;
	private String lien;
	private String sourcePdf;
}