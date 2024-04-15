public class ChemineeAdapter implements Appareil {
    private Cheminee cheminee;

    public ChemineeAdapter(Cheminee cheminee) {
        this.cheminee = cheminee;
    }

    @Override
    public void allumer() {
        cheminee.changerIntensite(10);
    }

    @Override
    public void eteindre() {
        cheminee.changerIntensite(0);
    }
}
