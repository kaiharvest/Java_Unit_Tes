package programmer.zaman.now.test;

import org.junit.jupiter.api.*;
import programmer.zaman.now.test.generator.SimpleTestNameGenerator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayNameGeneration(SimpleTestNameGenerator.class)
// @DisplayName("Test untuk Calculator class)")
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After all");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Before each");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("After each");
    }

    @Test
    // @DisplayName("Test sekenario sukses untuk method add(Integer, Integer)")
    public void testAddSucces() {
        var result = calculator.add(10, 10);
        assertEquals(20, result);

        // manual assert equals
//        if(result != 20) {
//            throw new RuntimeException("Test gagal");
//        }
    }

    @Test
    public void testDevideSucces() {
        var result = calculator.devide(100, 10);
        assertEquals(10, result);
    }

    @Test
    public void testDevideFailed() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.devide(10, 0);
        });
    }

    @Test
    @Disabled
    public void testComingSoon() {
        // Masih dalam perbaikan
    }

}
