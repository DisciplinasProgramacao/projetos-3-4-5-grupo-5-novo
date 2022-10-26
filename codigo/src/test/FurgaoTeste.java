import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FurgaoTeste {

    Furgao furgao = new Furgao(20000, 100000, "frg123");

    @Test
    void ipvaTeste() {
        Assertions.assertEquals(600, furgao.ipva());
    }

    @Test
    void seguroTeste() {
        Assertions.assertEquals(600, furgao.seguro());
    }

    @Test
    void getKilometragemTest() {
        Assertions.assertEquals(100000, furgao.getKilometragem());
    }

    @Test
    void alinhamentoTeste() {
        Assertions.assertEquals(1200, furgao.alinhamento());
    }

    @Test
    void vistoriaTeste() {
        Assertions.assertEquals(5000, furgao.vistoria());
    }
}
