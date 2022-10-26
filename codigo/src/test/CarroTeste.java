import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CarroTeste {

    Veiculo carro = new Carro(20000, 100000, "crr1234");

    @Test
    void ipvaTeste() {
        Assertions.assertEquals(800, carro.gastos.getIpva());
    }

    @Test
    void seguroTeste() {
        Assertions.assertEquals(1300, carro.gastos.getSeguro());
    }

    @Test
    void getKilometragemTest() {
        Assertions.assertEquals(100000, carro.getKilometragem());
    }

    @Test
    void alinhamentoTeste() {
        Assertions.assertEquals(800, carro.gastos.getAlinhamento());
    }
}
