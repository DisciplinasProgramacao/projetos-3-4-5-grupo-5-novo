import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaminhaoTeste {

    Veiculo caminhao = new Caminhao(20000, 100000, "cmh1234");

    @Test
    void ipvaTeste() {
        Assertions.assertEquals(200, caminhao.gastos.getIpva());
    }

    @Test
    void seguroTeste() {
        Assertions.assertEquals(2400, caminhao.gastos.getSeguro());
    }

    @Test
    void getKilometragemTest() {
        Assertions.assertEquals(100000, caminhao.getKilometragem());
    }

    @Test
    void manutencaoTeste() {
        Assertions.assertEquals(5000, caminhao.gastos.getManutencao());
    }

    @Test
    void vistoriaTeste() {
        Assertions.assertEquals(3333.33, caminhao.gastos.getVistoria());
    }
}
