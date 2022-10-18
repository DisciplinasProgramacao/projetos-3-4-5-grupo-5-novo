package test;

import main.Furgao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FurgaoTeste {

    Furgao furgao = new Furgao(20000, 100000);

    @Test
    void ipvaTeste() {
        Assertions.assertEquals(600, furgao.ipva());
    }

    @Test
    void seguroTeste() {
        Assertions.assertEquals(600, furgao.seguro());
    }
}
