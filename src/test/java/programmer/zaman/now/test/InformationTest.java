package programmer.zaman.now.test;

import org.junit.jupiter.api.*;

@DisplayName("Information test")
@Tags({
        @Tag("One"),
        @Tag("Two")
})
public class InformationTest {

    @Test
    @DisplayName("Ini test 1")
    void test1(TestInfo info) {
        System.out.println(info.getDisplayName());
        System.out.println(info.getTags());
        System.out.println(info.getTestClass().orElse(null));
        System.out.println(info.getTestMethod().orElse(null));
    }

}
