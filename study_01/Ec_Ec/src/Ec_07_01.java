
public class Ec_07_01 {
    // 필요한 상수 정의
	private Ec_07_01() {}
	final static double KILOGRAMS_PER_POUND = 0.45359237;
	final static double POUNDS_PER_KILOGRAM = 2.20462;
	final static double CENTIMETERS_PER_INCH = 2.54;
	final static double INCHES_PER_CENTIMETER = 0.393701;
	

    public static double toPounds(double kilograms) {
        // 메소드 내부를 채워주세요
		return kilograms * POUNDS_PER_KILOGRAM;
    }
    public static double toKilograms(double pounds) {
        // 메소드 내부를 채워주세요
    	return pounds * KILOGRAMS_PER_POUND;
    }
    public static double toCentimeters(double inches) {
        // 메소드 내부를 채워주세요
    	return inches * CENTIMETERS_PER_INCH;
    }
    public static double toInches(double centimeters) {
        // 메소드 내부를 채워주세요
    	return centimeters * INCHES_PER_CENTIMETER;
    }
    public static double toFahrenheit(double celsius) {
        // 메소드 내부를 채워주세요
    	return (double)celsius * (9.0 / 5) + 32;
    }
    public static double toCelsius(double fahrenheit) {
        // 메소드 내부를 채워주세요
    	return ((double)fahrenheit - 32) * (5.0 / 9);
    }
}
