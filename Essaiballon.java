

import java.util.Scanner;

public class Essaiballon {

	public static void cree() {
		Scanner scanner1 = new Scanner(System.in);
		System.out.print("Entrez l'identificateur du ballon : ");
		String identificateur = scanner1.nextLine();
		System.out.print("Entrez la taille du ballon : ");
		int taille = scanner1.nextInt();
		Ballon nouveauBallon = new Ballon(identificateur, taille);
		Ballon.mesInstances.addElement(nouveauBallon);
		System.out.println("Ballon créé avec succès !");
	}

	public static void afficher() {
		int nbdesballon = Ballon.mesInstances.size();
		for (int i = 0; i < nbdesballon; i++) {
			System.out.println("Ballon " + (i + 1) + ": \n" + (Ballon.mesInstances.get(i)).toSting());
			;
		}

	}

	public static void supprimer() {
		int nbdesballon = Ballon.mesInstances.size();
		if (nbdesballon != 0) {
			System.out.print("Entrez l'index du ballon à détruire : ");
			Scanner h = new Scanner(System.in);
			int index = h.nextInt();

			if (index >= 0 && index < nbdesballon) {
				Ballon.mesInstances.removeElementAt(index);
				System.out.println("Ballon détruit avec succès !");
			} else {
				System.out.println("Index incorrect !");
			}
		} else {
			System.out.println("La liste des ballons est vide !");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choix =-1;
		do {
			System.out.println("choix disponible :");
			System.out.println("1. Créer un ballon");
			System.out.println("2. Afficher la liste des ballons");
			System.out.println("3. Détruire un ballon");
			System.out.println("0. Quitter");
			System.out.print("Entrez votre choix : ");
			
			choix = scanner.nextInt();

			switch (choix) {

			case 1:
				Essaiballon.cree();

				break;
			case 2:
				Essaiballon.afficher();

				break;
			case 3:
				Essaiballon.supprimer();
				break;
			case 0:
				System.out.println("quitter");
				break;
			default:
				System.out.println("choix invalide");
			}
		} while (choix != 0);		

	}
}
