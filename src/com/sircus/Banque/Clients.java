package com.sircus.Banque;


public class Clients {
	
	protected String nomClient;
	protected String prenomClient;
	protected String NAS;
	protected double salaireAnnuel;
	protected CompteBancaire leCompte;
	
	// ---------------------------- NOM CLIENT -------------------------------
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nom) {
		nomClient = nom;
	}
	
	// ---------------------------- PRENOM CLIENT -------------------------------
	public String getPrenomClient() {
		return prenomClient;
	}
	public void setPrenomClient(String prenom) {
		prenomClient = prenom;
	}
	
	// ---------------------------- NAS CLIENT -------------------------------
	public String getNAS() {
		return NAS;
	}
	public void setNAS(String nAS) {
		NAS = nAS;
	}
	
	// ---------------------------- SALAIRE ANNUEL CLIENT -------------------------------
	public double getSalaireAnnuel() {
		return salaireAnnuel;
	}
	public void setSalaireAnnuel(double salaireAnnuel) {
		this.salaireAnnuel = salaireAnnuel;
	}
	
	
	// ---------------------------- COMPTE CLIENT -------------------------------
	public CompteBancaire getLeCompte() {
		return leCompte;
	}
	public void setLeCompte(CompteBancaire leCompte) {
		this.leCompte = leCompte;
	}

	public Clients(String nom, String prenom, String nas, double salaire, double solde)
	{
		nomClient = nom;
		prenomClient = prenom;
		NAS = nas;
		salaireAnnuel = salaire;
		leCompte = new CompteBancaire (solde);
	}
	public Clients() {
		// TODO Auto-generated constructor stub
	}
}
