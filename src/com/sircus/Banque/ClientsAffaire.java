package com.sircus.Banque;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;

public class ClientsAffaire extends Clients{

	private int typeCompagnie;
	private String nomCompagnie;
	
	//----------------------------- TYPE COMPAGNIE -------------------------
	public int getTypeCompagnie() {
		return typeCompagnie;
	}
	public void setTypeCompagnie(int typeCompagnie) {
		this.typeCompagnie = typeCompagnie;
	}
	
	//----------------------------- TYPE COMPAGNIE -------------------------
	public String getNomCompagnie() {
		return nomCompagnie;
	}
	public void setNomCompagnie(String nomCompagnie) {
		this.nomCompagnie = nomCompagnie;
	}


	public ClientsAffaire (String nom, String prenom, String nas, double salaire, double solde, int typeCo, String nomCo)
	{
		super(nom, prenom, nas, salaire, solde);

		typeCompagnie = typeCo;		
	}
	
	@Override
	public String toString() {
		 Date today = new Date();
	 	NumberFormat formatter = NumberFormat.getCurrencyInstance();
		return 	"\nNom: " + getNomClient() +
				"\nPrenom: " + getPrenomClient() +
				"\nNAS: " + getNAS() +
				"\nDate de creation : " + DateFormat.getInstance().format(today) +
				"\nSalaire annuel: " + formatter.format(getSalaireAnnuel()) +
				"\n# de compte: " + leCompte.getNumCompte() +
				"\nSolde: " + formatter.format(leCompte.getSoldeCompte()) +
				"\nType: Affaire" +
				"\nCategorie: " + getTypeCompagnie() + 
				"\nNom de la compagnie : " + getNomCompagnie() + "\n" +
				" *********************** ";
		}
	

}
