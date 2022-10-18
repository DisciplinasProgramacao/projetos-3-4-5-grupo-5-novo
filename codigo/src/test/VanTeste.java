package test;

import main.Van;
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
}
