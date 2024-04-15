
public class MainGraphique {

	public static void main(String args[])
	{
		Telecommande t=new Telecommande();
		
		
		Lampe l1=new Lampe("Lampe1");
		t.ajouterAppareil(l1);

		Hifi hifi = new Hifi();
		t.ajouterAppareil(hifi);
		
		Cheminee c = new Cheminee(); 
		ChemineeAdapter ca = new ChemineeAdapter(c);
		t.ajouterAppareil(ca);


		TelecommandeGraphique tg=new TelecommandeGraphique(t);
		
		
	}
	
}
