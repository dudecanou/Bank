package com.sircus.Banque;

public class CompteBancaire {

	private double soldeCompte;
	protected int numCompte;
	private static int icr =1000;

	
	// ------------------------- SOLDE COMPTE ------------------------
	public double getSoldeCompte() {
		return soldeCompte;
	}
	public void setSoldeCompte(double solde) {
		this.soldeCompte = solde;
	}
	
	// ------------------------- NUMERO COMPTE ------------------------

	public int getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	public CompteBancaire (double solde)
	{
		soldeCompte = solde;
		numCompte = icr ++;
	}
}
