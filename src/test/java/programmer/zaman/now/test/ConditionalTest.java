package programmer.zaman.now.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionalTest {

    @Test
    @EnabledOnOs({OS.WINDOWS})
    public void testRunOnlyWindows() {

    }

    @Test
    @DisabledOnOs({OS.WINDOWS})
    public void testDisabledOnlyWindows() {

    }

    @Test
    @EnabledOnJre({JRE.JAVA_8})
    public void testRunJre() {

    }

    @Test
    @DisabledOnJre({JRE.JAVA_11})
    public void testDisabledJre()  {

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17)
    public void testEnabledJava11To17() {

    }

    @Test
    @DisabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17)
    public void testDisabledJava11To17() {

    }

}
