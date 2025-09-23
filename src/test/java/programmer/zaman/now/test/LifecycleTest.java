package programmer.zaman.now.test;

import org.junit.jupiter.api.Test;

public class LifecycleTest {

    private String name;

    @Test
    void testA() {
        name = "Indra";
    }

    @Test
    void testB() {
        System.out.println(name);
    }

}
