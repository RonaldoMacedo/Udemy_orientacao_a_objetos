package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double real(double dollar, double dollarPrice) {
		return dollar * dollarPrice * (1.0 + IOF);
	}

}
