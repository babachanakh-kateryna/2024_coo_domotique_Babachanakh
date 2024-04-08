import java.util.*;

public class Telecommande {

    private List<Appareil> appareils;


    public Telecommande() {
        appareils = new ArrayList<>();
    }

    public void ajouterAppareil(Appareil appareil) {
        appareils.add(appareil);
    }

    public void activerAppareil(int indice) {
        if (indice >= 0 && indice < appareils.size()) {
            appareils.get(indice).allumer();
        }else {
            throw new IllegalArgumentException("appareil inexistante");
        }
    }

    public void desactiverAppareil(int indice) {
        if (indice >= 0 && indice < appareils.size()) {
            appareils.get(indice).eteindre();
        }else {
            throw new IllegalArgumentException("appareil inexistante");
        }
    }

    public void activerTout() {
        for (Appareil appareil : appareils) {
            appareil.allumer();
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Appareil appareil : appareils) {
            result.append(appareil.toString()).append("\n");
        }
        return result.toString();
    }

    public List<Appareil> getAppareils() {
        return appareils;
    }
}
