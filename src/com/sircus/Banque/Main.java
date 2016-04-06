package com.sircus.Banque;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
		 
		  
		 String nom, prenom, statut, nomCo,nas;
   		 int age = 0, annee = 0, typeCo;
   		 int choix;
   		 double taux, salaire, solde;
   		 
   		 SimpleDateFormat formatter = new SimpleDateFormat ("yyyy.MM.dd" ); 
   		 Date date = new Date(); 
   		 
		 
		 
		 System.out.println("\n------------ GESTION BANQUE ------------");
		 System.out.println("\nNom de la Banque :");
         nom = sc.nextLine();
         
         
         
         System.out.println("\nTaux de la ristourne :");
         taux = sc.nextDouble();
                  
   		 MiniBanque Banque = new MiniBanque(nom, taux);

		 do
		 {
	            System.out.println("\n**************NENU BANQUE " 			+ Banque.getNomBanque()+
	            							  	 " , TAUX DE RISTOURNE : "	+Banque.getTaxeRistourne()+
	            												" % ) ********************");
	            
	            System.out.println("\n(1) - Creer un nouveau client etudiant");
	            System.out.println("(2) - Creer un nouveau client affaire");
	            System.out.println("(3) - Afficher les données d'un client en donnant son numéro de compte");
	            System.out.println("(4) - Afficher le total et la moyenne des salaires de tous les clients");
	            System.out.println("(5) - Modifier les données d'un client");
	            System.out.println("(6) - Faire un dépot dans le compte d'un client en donnant son numéro de compte");
	            System.out.println("(7) - Faire un retrait du compte d'un client en donnant son numéro de compte");
	            System.out.println("(8) - Faire le calcul de la ristourne annuelle");
	            System.out.println("(9) - Faire afficher les informations de tous les clients");
	            System.out.println("(10) - Quitter l'application");
	            
	            System.out.println("\nVeuillez faire votre choix :");
	            choix = sc.nextInt();
	            
	            sc.nextLine();
	            
	            switch (choix)
	            {
	            case 1:
	            	Banque.CreationClientEtud();
	            break;
	            
	            case 2:
	            	Banque.CreationClientAffaire();
	            break;
	            
	            case 3:
	            	Banque.affichageInfo();
	            break;
	            
	            case 4:
	            	Banque.totalSalaire();
	            	Banque.moyenneSalaire();
	            break;
	            
	            case 5:
	            	Banque.modifier();
	            break;
	            
	            case 6:
	            	Banque.depotSolde();
;
	            break;
	            
	            case 7:
	            	Banque.retraitSolde();
	            break;
	            
	            case 8:
	            	Banque.ristourne();
	            break;
	            
	            case 9:
	            	Banque.affichageComplet();
	            break;
	            
	            case 10:
	            	System.exit(0);
	            break;
	            
	            }


		 }
		 while(choix!=11);
	}

}
