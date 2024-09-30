package praktikum;

public class SpeedLights {
    /**
     * есть нет превывшения - green
     * есть превывшение <= 20 - yellow
     * есть превывшение > 20 - red
     */
    public String showLight(int currentSpeed) {
        if (currentSpeed < 0) {
            throw new IllegalArgumentException("Current speed cannot be negative");
        }

        if (currentSpeed < 60)
            return "green";
        else if (currentSpeed <= 80)
            return "yellow";
        else
            return "red";
    }
}
