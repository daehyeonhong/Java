package ch10.ch03;

public class CurrencyConverter {
	private static double rate;

	public static double toDollar(double won) {
		return won / rate;
	}

	public static double toKWR(double dollor) {
		return dollor * rate;
	}

	public static void setRate(double r) {
		rate = r;
	}

}