import java.util.Random;


public class SerpentsEtEchelles {

	public static void main(String[] args) {

	    TableauDeJeu  Tableau= ...;  	
	    CircularlyLinkedList<Joueur> joueurs= new CircularlyLinkedList<Joueur>();
	    boolean finDepartie = false;
	    Joueur joueurCourrant;
	    
	    
          //à faire: lire le nombre de joueurs dans la ligne de commandes, les ajouter dans la liste chainée.

	    //À faire, tant qu'aucun joueur n'atteint la case 100, la bouche principale du jeu fait avancer le joueur courrant. 
	    //Chaque itéaration de la boucle correspond au tour de 1 joueur.    
	    // pendant son tour, le joueur role, un 1 (1-6) avance du nombre de cases indiqué, et, si il tombe sur un serpent ou une échelle, 
	    //suis celle-ci. 
	    while(...)
	    {
	    	System.out.println("Tour de " + joueurCourrant.getNom() );
		....
	    	System.out.println("Le joureur  " + joueurCourrant.getNom() + " a atteint la tuile " + joueurCourrant.getPosition() );


	    }	
    

	System.out.println("Le joueur" + joueurCourrant.getNom() + " a gagné");

	    	
	}//main

	//retourne un nombre entre 1 et 6 (inclusivement) de manière équiprobable.
	public static int rouleLeDe() { 

	}
	
	
	
}// class 
