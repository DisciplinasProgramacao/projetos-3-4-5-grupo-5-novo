import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CarroTeste {

    Carro carro = new Carro(20000, 100000);

    @Test
    void ipvaTeste() {
        Assertions.assertEquals(800, carro.ipva());
    }

    @Test
    void seguroTeste() {
        Assertions.assertEquals(1300, carro.seguro());
    }

    @Test
    void getKilometragemTest() {
        Assertions.assertEquals(100000, carro.getKilometragem());
    }

    @Test
    void alinhamentoTeste() {
        Assertions.assertEquals(800, carro.alinhamento());
    }
}
