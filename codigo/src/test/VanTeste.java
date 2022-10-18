import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VanTeste {

    Van van = new Van(20000, 100000);

    @Test
    void ipvaTeste() {
        Assertions.assertEquals(600, van.ipva());
    }

    @Test
    void seguroTeste() {
        Assertions.assertEquals(600, van.seguro());
    }

    @Test
    void getKilometragemTest() {
        Assertions.assertEquals(100000, van.getKilometragem());
    }

    @Test
    void alinhamentoTeste() {
        Assertions.assertEquals(1200, van.alinhamento());
    }

    @Test
    void vistoriaTeste() {
        Assertions.assertEquals(5000, van.vistoria());
    }
}
