package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SpeedLightsTest {
    private final String expectedLight;
    private final int speed;

    public SpeedLightsTest(String expectedLight, int speed) {
        this.expectedLight = expectedLight;
        this.speed = speed;
    }

    @Parameterized.Parameters(name = "expected light {0}, speed = {1}")
    public static Object[][] dataGenerator() {
        return new Object[][]{
                {"green", 50},  // 0
                {"yellow", 70},  // 1
                {"yellow", 80},  // 1
                {"red", 90}    // 2
        };
    }

    @Test
    public void checkLight() {
        var speedLights = new SpeedLights();
        assertEquals(expectedLight, speedLights.showLight(speed));
    }
}
