public class TemperatureConverter {
    // F to C
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    // C to F
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    // Checking if temperature is extreme (in C)
    public boolean isExtremeTemperature(double celsius) {
        return celsius < -40 || celsius > 50;
    }
    // K to C
    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        System.out.println("=== Temperature Converter ===");
        System.out.printf("100°C → %.2f°F%n", converter.celsiusToFahrenheit(100));
        System.out.printf("212°F → %.2f°C%n", converter.fahrenheitToCelsius(212));
        System.out.printf("373.15K → %.2f°C%n", converter.kelvinToCelsius(373.15));
        System.out.printf("Is 60°C extreme? %b%n", converter.isExtremeTemperature(60));
        System.out.printf("Is 20°C extreme? %b%n", converter.isExtremeTemperature(20));
    }
}
