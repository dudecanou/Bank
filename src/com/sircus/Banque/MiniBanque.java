package com.sircus.Banque;

import java.util.ArrayList;
import java.util.Scanner;

public class MiniBanque {

	public String nomBanque;
	public ArrayList<Clients> ListeClients = new ArrayList<Clients>();
	public double taxeRistourne;
	
	// ------------------------- NOM ------------------------
	public String getNomBanque() {
		return nomBanque;
	}
	public void setNomBanque(String nom) {
		this.nomBanque = nom;
	}
		
			
	// -------------------- TAXE RISTOURNE ---------------------
	public double getTaxeRistourne() {
		return taxeRistourne;
	}
	public void setTaxeRistourne(double taxeRistourne) {
		this.taxeRistourne = taxeRistourne;
	}
	
	public MiniBanque (String nom, double taxe )
	{
		nomBanque = nom;
		taxeRistourne = taxe;
	}
	
	public void CreationClientEtud()
	{
		 Scanner sc= new Scanner(System.in);
		String nom, prenom,nas;
  		 int age = 0, annee = 0;
  		 double salaire, solde;
  		  
		System.out.println("\n------------ NOUVEAU CLIENT ETUDIANT ------------");
  		 System.out.println("\nNom :");
  		  nom = sc.nextLine();
          
          System.out.println("\nPrenom :");
           prenom = sc.nextLine();
          
          System.out.println("\nSalaire annuel :");
           salaire = sc.nextDouble();
           sc.nextLine();
           
           System.out.println("\nNumero NAS :");
           nas = sc.nextLine();

           
           System.out.println("\nDepot solde :");
           solde = sc.nextInt();
           
           
          	 System.out.println("\nAge :");
               age = sc.nextInt();
               
               System.out.println("\nAnnee scolaire restante(s) :");
               annee = sc.nextInt(); 
           
          	 
               ClientsEtudiant clientEtud = new ClientsEtudiant (nom, prenom,nas,salaire,solde,annee,age);
               ListeClients.add(clientEtud);
                         
	}
	
	public void CreationClientAffaire()
	{
		 Scanner sc= new Scanner(System.in);
		String nom, prenom,nas,nomCo;
  		 int typeCo;
  		 double salaire, solde;
  		  
		System.out.println("\n------------ NOUVEAU CLIENT AFFAIRE ------------");
  		 	System.out.println("\nNom :");
  		 	nom = sc.nextLine();
          
  		 	System.out.println("\nPrenom :");
  		 	prenom = sc.nextLine();
          
  		 	System.out.println("\nSalaire annuel :");
  		 	salaire = sc.nextDouble();
  		 	sc.nextLine();
           
  		 	System.out.println("\nNumero NAS :");
  		 	nas = sc.nextLine();

           
  		 	System.out.println("\nDepot solde :");
  		 	solde = sc.nextInt();
  		 	sc.nextLine();
           
          	System.out.println("\nNom compagnie :");
            nomCo = sc.nextLine();
               
            System.out.println("\nType compagnie (1 : gouvernementale  2 : éducative  3 : à but non lucratif) :");
            typeCo = sc.nextInt();
               
            ClientsAffaire clientAff = new ClientsAffaire (nom, prenom,nas,salaire,solde,typeCo,nomCo);
            ListeClients.add(clientAff);
             
	}
	
	public void affichageInfo()
	{
		 Scanner sc= new Scanner(System.in);

		int num = 0;
		
		System.out.println("Veuillez saisir le # du compte client : ");
		num=sc.nextInt();
		
		for(int i=0 ; i < ListeClients.size() ; i++)
		{
			if(ListeClients.get(i).leCompte.getNumCompte()== num)
			System.out.println(ListeClients.get(i).toString());
		}
	}
	
	public void totalSalaire()
	{
		double total=0;
		
		for(int i=0 ; i < ListeClients.size() ; i++)
		{
			total+=ListeClients.get(i).getSalaireAnnuel();
		}
		System.out.println("\nLe total des salaires represente : "+ String.format( "%.2f", total ) + " $");
	}
	
	public void moyenneSalaire()
	{
		double moy=0;
		
		for(int i=0 ; i < ListeClients.size() ; i++)
		{
			moy+=ListeClients.get(i).getSalaireAnnuel();
		}
		moy = moy/ListeClients.size();
		System.out.println("\nLa moyenne total des salaires represente : "+ String.format( "%.2f", moy ) + " $");

	}
	
	public void modifier()
	{
		Scanner sc= new Scanner(System.in);

		int num = 0;
		
		System.out.println("Veuillez saisir le # du compte client : ");
		num=sc.nextInt();
		
		for(int i=0 ; i < ListeClients.size() ; i++)
		{
			int choix;
			String nom, prenom, nas;
			double salaire;
			
			System.out.println("\n------- Informations du client --------");
			if(ListeClients.get(i).leCompte.getNumCompte()== num)
			System.out.println(ListeClients.get(i).toString());
			
			do
			{
				System.out.println("\n(1) - Modifier Nom");
				System.out.println("\n(2) - Modifier Prenom");
				System.out.println("\n(3) - Modifier Salaire annuel");
				System.out.println("\n(4) - Modifier Numero NAS");
				System.out.println("\n(5) - Enregistrer et Quitter");

			
				System.out.println("\nVeuillez faire votre choix :");
	            choix = sc.nextInt();
	            sc.nextLine();
	            
	            switch (choix)
	            {
	            case 1:
	            	System.out.println("\nNouveau Nom :");
	            	nom = sc.nextLine();
	            	ListeClients.get(i).setNomClient(nom);
					System.out.println("\nModification enregistrer !!");
	            break;
	            
	            case 2:
	            	System.out.println("\nNouveau Prenom :");
	            	prenom = sc.nextLine();
	            	ListeClients.get(i).setPrenomClient(prenom);
					System.out.println("\nModification enregistrer !!");
	            break;
	            
	            case 3:
	            	System.out.println("\nNouveau Salaire :");
	            	 salaire = sc.nextDouble();
	            	ListeClients.get(i).setSalaireAnnuel(salaire);
					System.out.println("\nModification enregistrer !!");
	            break;
	            
	            case 4:
	            	System.out.println("\nNouveau NAS :");
	            	nas = sc.nextLine();
	            	ListeClients.get(i).setNAS(nas);
					System.out.println("\nModification enregistrer !!");
	            break;
	            
	            case 5:
	            	break;

	            }
		 }
		 while(choix!=5);
			
			System.out.println("\n------- Nouvelles Informations du client --------");
			if(ListeClients.get(i).leCompte.getNumCompte()== num)
				System.out.println(ListeClients.get(i).toString());
		}
	}
	
	
	public void depotSolde()
	{
		 Scanner sc= new Scanner(System.in);
		 
		 int num;		 
		double depot;
		
		System.out.println("Veuillez saisir le # du compte client : ");
		num = sc.nextInt();
		System.out.println("montant: ");
		depot = sc.nextDouble();
		
		
		for(int i=0 ; i < ListeClients.size() ; i++)
		{
			if(ListeClients.get(i).leCompte.getNumCompte()==num)
			{
				ListeClients.get(i).leCompte.setSoldeCompte(ListeClients.get(i).leCompte.getSoldeCompte()+depot);
				depot=ListeClients.get(i).leCompte.getSoldeCompte();
			}
		
		}
		System.out.println("\nLe depot a ete effectuer au client numero : " + num);

	}
	
	public void retraitSolde()
	{
		 Scanner sc= new Scanner(System.in);
		 
		 int num;		 
		double retrait;
		
		System.out.println("Veuillez saisir le # du compte client : ");
		num = sc.nextInt();
		System.out.println("montant: ");
		retrait = sc.nextDouble();
		
		
		for(int i=0 ; i < ListeClients.size() ; i++)
		{
			if(ListeClients.get(i).leCompte.getNumCompte()==num)
			{
				ListeClients.get(i).leCompte.setSoldeCompte(ListeClients.get(i).leCompte.getSoldeCompte()-retrait);
				retrait=ListeClients.get(i).leCompte.getSoldeCompte();
			}
		
		}
		System.out.println("\nLe retrait a ete effectuer au client numero : " + num);

	}
	
	public void ristourne()
	{
		double total = 0;

		for(int i=0 ; i < ListeClients.size() ; i++)
		{
				total+=ListeClients.get(i).leCompte.getSoldeCompte()*(getTaxeRistourne()/100);
		}
		System.out.println("\nLe de ristourne annuel represente : "+ String.format( "%.2f", total ) + " $");	
		
	}
	
	public void affichageComplet()
	{
		for(int i=0 ; i < ListeClients.size() ; i++)
		{
			System.out.println("\n");
			System.out.println("\n********************************************");
			System.out.println(ListeClients.get(i).toString());
		}
	}
	
	
	
	
}
