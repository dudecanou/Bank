package com.sircus.Banque;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;

public class ClientsEtudiant extends Clients{

	private int niveauScolarite;
	private int ageEtudiant;
	
	// ------------------------- NIVEAU SCOLAIRE ----------------------
	public int getNiveauScolarite() {
		return niveauScolarite;
	}	
	public void setNiveauScolarite(int niveauScolarite) {
		this.niveauScolarite = niveauScolarite;
	}
	
	// ------------------------- AGE ----------------------
	public int getAgeEtudiant() {
		return ageEtudiant;
	}
	public void setAgeEtudiant(int age) {
		this.ageEtudiant = age;
	}
	
	
	
	public ClientsEtudiant (String nom, String prenom, String nas, double salaire, double solde, int niveau, int age)
	{
		super(nom, prenom, nas, salaire, solde);
		niveauScolarite = niveau;
		ageEtudiant = age;
		
	}
	
	@Override
	public String toString() {
 		 Date today = new Date();
 		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		return 	"\nNom: " + getNomClient() +
				"\nPrenom: " + getPrenomClient() +
				"\nNAS: " + getNAS() +
				"\nSalaire annuel: " + formatter.format(getSalaireAnnuel()) +
				"\nDate de creation : " + DateFormat.getInstance().format(today) +
				"\n# de compte: " + leCompte.getNumCompte() +
				"\nSolde: " + formatter.format(leCompte.getSoldeCompte()) +
				"\nNiveau scolarite : " + getNiveauScolarite() +
				"\nAge  : " + getAgeEtudiant() + "\n" +
				" *********************** ";
		}
	

}
