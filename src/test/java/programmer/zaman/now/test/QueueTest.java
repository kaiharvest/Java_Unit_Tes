package programmer.zaman.now.test;

import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.Queue;

@DisplayName("A Queue")
public class QueueTest {

    private Queue<String> name;

    @Nested
    @DisplayName("When New")
    public class WhenNew {

        @BeforeEach
        void setUp() {
            name = new LinkedList<>();
        }

        @Test
        @DisplayName("when offer, size must be 1")
        void offerNewData() {
            name.offer("Indra");
            Assertions.assertEquals(1, name.size());
        }

        @Test
        @DisplayName("when offer 2 data, size must be 2")
        void offerMoreData() {
            name.offer("Indra");
            name.offer("Dwi");
            Assertions.assertEquals(2, name.size());
        }

    }

}
