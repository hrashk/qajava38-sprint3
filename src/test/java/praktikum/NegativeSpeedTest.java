package praktikum;

import org.junit.Test;
import org.junit.function.ThrowingRunnable;

import static org.junit.Assert.assertThrows;

public class NegativeSpeedTest {
    @Test(expected = IllegalArgumentException.class)
    public void negativeSpeedsAreRejected() {
        var speedLights = new SpeedLights();
        speedLights.showLight(-10);
    }

    @Test
    public void negativeSpeedsAreRejected2() {
        var speedLights = new SpeedLights();

        assertThrows(IllegalArgumentException.class,
                new MyThrowingRunnable(speedLights));  // () -> speedLights.showLight(-10)
    }

    private static class MyThrowingRunnable implements ThrowingRunnable {
        private final SpeedLights speedLights;

        public MyThrowingRunnable(SpeedLights speedLights) {
            this.speedLights = speedLights;
        }

        @Override
        public void run() throws Throwable {
            speedLights.showLight(-10);
        }
    }
}
