public class AltonagaLab12 {
    // class Heater {
    private int temperature;
    private int max;
    private int min;
    private int increment;

    // Default constructor
    public AltonagaLab12(int min, int max) {
        this.min = min;
        this.max = max;
        temperature = 15;
        increment = 5;
    }

    // Setter to increase temperature
    public void warmer() {
        // If temperature exceeds max, display "Exceeds max temp!"
        temperature += increment;
        if (temperature > max) {
            System.out.println("Exceeds max temp!");
            temperature -= increment;
        }
    }

    // Setter to decrease temperature
    public void cooler() {
        // If temperature exceeds min, display "Exceeds min temp!"
        temperature -= increment;
        if (temperature < min) {
            System.out.println("Exceeds min temp!");
            temperature += increment;
        }
    }

    // Setter to set increment
    public void setIncrement(int increment) {
        if (increment < 0) {
            System.out.println("Increment cannot be negative!");
        } else {
            this.increment = increment;
        }
    }

    // Getter to return temperature
    public int getTemperature() {
        return temperature;
    }
}
