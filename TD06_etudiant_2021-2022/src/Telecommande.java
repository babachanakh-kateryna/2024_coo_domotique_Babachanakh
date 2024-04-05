import java.util.*;

public class Telecommande {

    private List<Lampe> lampes;


    public Telecommande() {
        lampes = new ArrayList<>();
    }

    public void ajouterLampe(Lampe lampe) {
        lampes.add(lampe);
    }

    public void activerLampe(int indiceLampe) {
        if (indiceLampe < 0 || indiceLampe >= lampes.size()) {
            throw new IllegalArgumentException("Lampe inexistante");
        }
        lampes.get(indiceLampe).allumer();
    }

    public void desactiverLampe(int indiceLampe) {
        if (indiceLampe < 0 || indiceLampe >= lampes.size()) {
            throw new IllegalArgumentException("Lampe inexistante");
        }
        lampes.get(indiceLampe).eteindre();
    }

    public void activerTout() {
        for (Lampe lampe : lampes) {
            lampe.allumer();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Lampe lampe : lampes) {
            sb.append(lampe.toString()).append("\n");
        }
        return sb.toString();
    }

    public List<Lampe> getLampes() {
        return lampes;
    }
}
