import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaminhaoTeste {

    Caminhao caminhao = new Caminhao(20000, 100000);

    @Test
    void ipvaTeste() {
        Assertions.assertEquals(200, caminhao.ipva());
    }

    @Test
    void seguroTeste() {
        Assertions.assertEquals(2400, caminhao.seguro());
    }
}
