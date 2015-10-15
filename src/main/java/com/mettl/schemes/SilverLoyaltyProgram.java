package com.mettl.schemes;


/**
 * @author amahajan
 * 
 */
public class SilverLoyaltyProgram {
	public static long getLoyaltyPoints(double transactionAmount) {
		long divisor = Math.round(transactionAmount / 100);
		long points = divisor * 2;
		return points;
	}
}
