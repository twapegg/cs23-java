public class AltonagaLab12Test {
    public static void main(String[] arg) {

        AltonagaLab12 heater = new AltonagaLab12(10, 31);

        System.out.println(heater.getTemperature()); // displays 15
        heater.warmer();
        System.out.println(heater.getTemperature()); // displays 20
        heater.warmer();
        heater.warmer();
        System.out.println(heater.getTemperature()); // displays 30
        heater.warmer(); // displays "Exceeds max temp!"
        System.out.println(heater.getTemperature()); // displays 30
        heater.cooler();
        System.out.println(heater.getTemperature()); // displays 25
        heater.cooler();
        heater.cooler();
        System.out.println(heater.getTemperature()); // displays 15
        heater.cooler();
        System.out.println(heater.getTemperature()); // displays 10
        heater.cooler(); // displays "Exceeds min temp!"
        System.out.println(heater.getTemperature()); // displays 10
        heater.setIncrement(0);
        System.out.println(heater.getTemperature()); // displays 10
        heater.setIncrement(-5); // Displays "Increment cannot be negative!"
        heater.setIncrement(20);
        heater.warmer();
        System.out.println(heater.getTemperature()); // displays 30

        // heater.temperature = 35; // compile error
        // heater.increment = 20; // compile error
        // heater.min = 5; // compile error
        // heater.max = 40; // compile error
    }
}
