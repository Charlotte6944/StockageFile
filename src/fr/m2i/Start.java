package fr.m2i;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Start {

	public static void main(String[] args) {
		
		Communication com = new Communication();
		System.out.print("Quel est le nombre de personne? ");
		int nbrPersonne = com.getScan().nextInt();
		ArrayList<Personne> listePersonne = new ArrayList<>();
		
		for(int i = 0; i < nbrPersonne; i++) {
			System.out.println("Personne n° " + (i+1));
			System.out.print("Nom: ");
			String nom = com.getScan().next();
			
			System.out.print("Prénom: ");
			String prenom = com.getScan().next();
			
			Personne personne = new Personne(nom, prenom);
			listePersonne.add(personne);
		}
		
		// Ecriture
		try {
		       FileOutputStream fileOut = new FileOutputStream("liste.txt");
		       ObjectOutputStream out = new ObjectOutputStream(fileOut);
		       out.writeObject(listePersonne);
		       out.close();
		       fileOut.close();
		       System.out.println("\nSerialisation terminée avec succès...\n");
		 
		     } catch (FileNotFoundException e) {
		       e.printStackTrace();
		     } catch (IOException e) {
		       e.printStackTrace();
		     }
	    }

		
	}
