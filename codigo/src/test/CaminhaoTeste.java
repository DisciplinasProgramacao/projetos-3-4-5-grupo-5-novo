import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaminhaoTeste {

    Caminhao caminhao = new Caminhao(20000, 100000, "cmh123");

    @Test
    void ipvaTeste() {
        Assertions.assertEquals(200, caminhao.ipva());
    }

    @Test
    void seguroTeste() {
        Assertions.assertEquals(2400, caminhao.seguro());
    }

    @Test
    void getKilometragemTest() {
        Assertions.assertEquals(100000, caminhao.getKilometragem());
    }

    @Test
    void alinhamentoTeste() {
        Assertions.assertEquals(5000, caminhao.alinhamento());
    }

    @Test
    void vistoriaTeste() {
        Assertions.assertEquals(3333.33, caminhao.vistoria());
    }
}
