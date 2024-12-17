class TemperatureConverter {

    // convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    //  convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}

public class Temperature_Conversion {
    public static void main(String[] args) {

        double celsius1 = 25.0;
        double fahrenheit1 = TemperatureConverter.celsiusToFahrenheit(celsius1);
        System.out.println(celsius1 + " °C = " + fahrenheit1 + " °F");


        double fahrenheit2 = 77.0;
        double celsius2 = TemperatureConverter.fahrenheitToCelsius(fahrenheit2);
        System.out.println(fahrenheit2 + " °F = " + celsius2 + " °C");


        double celsius3 = 0.0;
        double fahrenheit3 = TemperatureConverter.celsiusToFahrenheit(celsius3);
        System.out.println(celsius3 + " °C = " + fahrenheit3 + " °F");

        double fahrenheit4 = 32.0;
        double celsius4 = TemperatureConverter.fahrenheitToCelsius(fahrenheit4);
        System.out.println(fahrenheit4 + " °F = " + celsius4 + " °C");
    }
}
