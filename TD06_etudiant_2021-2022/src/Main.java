import java.util.Scanner;

/**
 * classe qui cree des lampes et une telecommande associee.
 */

public class Main {

	public static void main(String args[]) {
		// la telecommande vide
		Telecommande t = new Telecommande();

		// Ajout des appareils à la télécommande
		ajouterAppareils(t);

		// Test d'activation des appareils
		t.activerAppareil(0); // Première lampe
		t.activerAppareil(2); // Première chaîne hi-fi

		// Affichage de l'état initial des appareils
		System.out.println(t);

		// Lancement du menu de gestion
		lancerMenu(t);
	}

	/**
	 * menu qui permet de manipuler une telecommande
	 *
	 * @param t
	 *            telecommande a manipuler
	 */
	private static void lancerMenu(Telecommande t) {
		Scanner sc = new Scanner(System.in);

		boolean fini=false;

		// tant qu'il y a des commandes
		while (!fini) {

			// Affichage de l'état actuel
			System.out.println(t);

			// demande lampe et commande
			System.out.println("entrer le numero de la lampe ");
			int choix = sc.nextInt();
			System.out.println("entrer commande (+/-/exit)");
			String com = sc.nextLine();
			com = sc.nextLine();

			// si la commande est +, on active
			if (com.equals("+")) {
				System.out.println("== activer "+choix+"==");
				t.activerAppareil(choix);
			}
			// si la commande est - on descactive
			else if (com.equals("-")) {
				System.out.println("== desactiver "+choix+"==");
				t.desactiverAppareil(choix);
			}
			// si la commande est exit, on arrete
			else if (com.equals("exit")) {
				System.out.println("== Fin du programme == ");
				fini=true;
			}
			// commande non reconnue
			else {
				System.out.println("commande inconnue");
			}

			//affiche l'etat de le telecommande
			System.out.println(t);
		}
		sc.close();
	}

	/**
	 * ajout des appareils dans la telecommande
	 *
	 * @param t
	 *            telecommande dans lequelle on ajoute 4 lampes
	 */
	private static void ajouterAppareils(Telecommande t) {
		t.ajouterAppareil(new Lampe("Lampe1"));
		t.ajouterAppareil(new Lampe("Lampe2"));
		t.ajouterAppareil(new Hifi());
		t.ajouterAppareil(new Hifi());
		t.ajouterAppareil(new ThermostatAdapter());
	}


}
