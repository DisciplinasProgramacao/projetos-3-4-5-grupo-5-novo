import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FurgaoTeste {

    Veiculo furgao = new Furgao(20000, 100000, "frg123");

    @Test
    void ipvaTeste() {
        Assertions.assertEquals(600, furgao.gastos.getIpva());
    }

    @Test
    void seguroTeste() {
        Assertions.assertEquals(600, furgao.gastos.getSeguro());
    }

    @Test
    void getKilometragemTest() {
        Assertions.assertEquals(100000, furgao.getKilometragem());
    }

    @Test
    void alinhamentoTeste() {
        Assertions.assertEquals(1200, furgao.gastos.getAlinhamento());
    }

    @Test
    void vistoriaTeste() {
        Assertions.assertEquals(5000, furgao.gastos.getVistoria());
    }
}
