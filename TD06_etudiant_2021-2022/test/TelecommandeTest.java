import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelecommandeTest {

    @Test
    public void test1_AjoutLampe_TelecommandeVide() {
        Telecommande telecommande = new Telecommande();
        Lampe lampe = new Lampe("lampe1");

        telecommande.ajouterLampe(lampe);


        assertEquals(1, telecommande.getLampes().size());
    }
    @Test
    public void test2_AjoutLampe_TelecommandeAvecUneLampe() {
        Telecommande telecommande = new Telecommande();
        Lampe lampe1 = new Lampe("lampe1");
        telecommande.ajouterLampe(lampe1);

        Lampe lampe2 = new Lampe("lampe2");
        telecommande.ajouterLampe(lampe2);

        assertEquals(2, telecommande.getLampes().size());
    }

    @Test
    public void test3_ActiverLampe_ExistanteEnPositionZero() {
        Telecommande telecommande = new Telecommande();
        Lampe lampe = new Lampe("lampe1");
        telecommande.ajouterLampe(lampe);

        telecommande.activerLampe(0);

        assertTrue(lampe.isAllume());
    }

    @Test
    public void test4_ActiverLampe_ExistanteEnPositionUn() {
        Telecommande telecommande = new Telecommande();
        Lampe lampe1 = new Lampe("lampe1");
        Lampe lampe2 = new Lampe("lampe2");
        telecommande.ajouterLampe(lampe1);
        telecommande.ajouterLampe(lampe2);

        telecommande.activerLampe(1);

        assertTrue(lampe2.isAllume());
    }

    @Test
    public void test5_ActiverLampe_Inexistante() {
        Telecommande telecommande = new Telecommande();

        Exception exception = assertThrows(Exception.class, () -> telecommande.activerLampe(0));

        assertEquals("Lampe inexistante", exception.getMessage());
    }
}

