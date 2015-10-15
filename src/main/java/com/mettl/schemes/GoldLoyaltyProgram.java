package com.mettl.schemes;

/**
 * @author amahajan
 * 
 */
public class GoldLoyaltyProgram {
	public static long getLoyaltyPoints(double transactionAmount) {
		long divisor = Math.round(transactionAmount / 500);
		long points = divisor * 25;
		return points;
	}
}
