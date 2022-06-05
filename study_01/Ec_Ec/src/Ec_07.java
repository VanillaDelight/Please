
public class Ec_07 {

    public static void main(String[] args) {
        System.out.format("35 lb -> %.2f kg\n", Ec_07_01.toKilograms(35));
        System.out.format("62 kg -> %.2f lb\n", Ec_07_01.toPounds(62));
        System.out.format("12.2 in -> %.2f cm\n", Ec_07_01.toCentimeters(12.2));
        System.out.format("3.82 cm -> %.2f in\n", Ec_07_01.toInches(3.82));
        System.out.format("48 °F -> %.2f °C\n", Ec_07_01.toCelsius(48));
        System.out.format("-9 °C -> %.2f °F\n", Ec_07_01.toFahrenheit(-9));
    }
}
