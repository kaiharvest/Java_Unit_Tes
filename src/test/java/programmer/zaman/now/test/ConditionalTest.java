package programmer.zaman.now.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionalTest {

    @Test
    @EnabledOnOs({OS.WINDOWS})
    void testEnabledOnlyWindows() {

    }

    @Test
    @DisabledOnOs({OS.WINDOWS})
    void testDisabledOnlyWindows() {

    }

    @Test
    @EnabledOnJre({JRE.JAVA_8})
    void testEnabledRunJre() {

    }

    @Test
    @DisabledOnJre({JRE.JAVA_11})
    void testDisabledJre()  {

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17)
    void testEnabledJava11To17() {

    }

    @Test
    @DisabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17)
    void testDisabledJava11To17() {

    }

    @Test
    @EnabledIfSystemProperties(
            @EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    )
    void testEnabledOnJavaVendor() {

    }

    @Test
    @DisabledIfSystemProperties(
            @DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    )
    void testDisabledOnJavaVendor() {

    }

    @Test
    @EnabledIfEnvironmentVariables(
            @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    )
    void testEnabledOnProfileDev() {

    }

    @Test
    @DisabledIfEnvironmentVariables(
            @DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    )
    void testDisabledOnProfileDev() {

    }

}
