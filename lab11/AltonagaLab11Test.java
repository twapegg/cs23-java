class AltonagaLab11Test {
    public static void main(String[] args) {
        AltonagaLab11 heater = new AltonagaLab11();

        System.out.println(heater.getTemperature()); // displays 15
        heater.warmer();
        System.out.println(heater.getTemperature()); // displays 20
        heater.warmer();
        heater.warmer();
        System.out.println(heater.getTemperature()); // displays 30
        heater.cooler();
        System.out.println(heater.getTemperature()); // displays 25
        heater.cooler();
        heater.cooler();
        System.out.println(heater.getTemperature()); // displays 15

        // heater.temperature = 35; // compile error
    }
}