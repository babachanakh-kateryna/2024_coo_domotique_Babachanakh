import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelecommandeTest {

    @Test
    public void test1_AjoutAppareil_TelecommandeVide() {
        Telecommande telecommande = new Telecommande();
        Lampe lampe = new Lampe("lampe1");
        telecommande.ajouterAppareil(lampe);

        assertEquals(1, telecommande.getAppareils().size());
    }

    @Test
    public void test2_ActivationAppareil_Existante() {
        Telecommande telecommande = new Telecommande();
        Lampe lampe = new Lampe("lampe1");
        telecommande.ajouterAppareil(lampe);

        telecommande.activerAppareil(0);
        assertTrue(((Lampe) telecommande.getAppareils().get(0)).isAllume());
    }

    @Test
    public void test3_DesactivationAppareil_Existante() {
        Telecommande telecommande = new Telecommande();
        Lampe lampe = new Lampe("lampe1");
        telecommande.ajouterAppareil(lampe);
        telecommande.activerAppareil(0);

        telecommande.desactiverAppareil(0);
        assertFalse(((Lampe) telecommande.getAppareils().get(0)).isAllume());
    }

    @Test
    public void test4_ActivationAppareil_Inexistante() {
        Telecommande telecommande = new Telecommande();

        Exception exception = assertThrows(Exception.class, () -> telecommande.activerAppareil(0));

        assertEquals("appareil inexistante", exception.getMessage());
    }
}

