import java.util.*;

public class Telecommande {

    private List<Lampe> lampes;
    private List<Hifi> hifis;


    public Telecommande() {
        lampes = new ArrayList<>();
        hifis = new ArrayList<>();
    }

    public void ajouterLampe(Lampe lampe) {
        lampes.add(lampe);
    }

    public void ajouterHifi(Hifi hifi) {
        hifis.add(hifi);
    }

    public void activerLampe(int indiceLampe) {
        if (indiceLampe < 0 || indiceLampe >= lampes.size()) {
            throw new IllegalArgumentException("Lampe inexistante");
        }
        lampes.get(indiceLampe).allumer();
    }

    public void activerHifi(int indiceHifi) {
        if (indiceHifi >= 0 && indiceHifi < hifis.size()) {
            hifis.get(indiceHifi).allumer();
        } else {
            System.out.println("Hifi inexistante");
        }
    }

    public void desactiverLampe(int indiceLampe) {
        if (indiceLampe < 0 || indiceLampe >= lampes.size()) {
            throw new IllegalArgumentException("Lampe inexistante");
        }
        lampes.get(indiceLampe).eteindre();
    }

    public void desactiverHifi(int indiceHifi) {
        if (indiceHifi >= 0 && indiceHifi < hifis.size()) {
            hifis.get(indiceHifi).eteindre(); // Метод для выключения аудиосистемы
        } else {
            System.out.println("Hifi inexistante");
        }
    }


    public void activerTout() {
        for (Lampe lampe : lampes) {
            lampe.allumer();
        }
        for (Hifi hifi : hifis) {
            hifi.allumer();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Telecommande:\n");
        sb.append("Lampes:\n");
        for (Lampe lampe : lampes) {
            sb.append(" - ").append(lampe.toString()).append("\n");
        }
        sb.append("Hifis:\n");
        for (Hifi hifi : hifis) {
            sb.append(" - ").append(hifi.toString()).append("\n");
        }
        return sb.toString();
    }

    public List<Lampe> getLampes() {
        return lampes;
    }
}
