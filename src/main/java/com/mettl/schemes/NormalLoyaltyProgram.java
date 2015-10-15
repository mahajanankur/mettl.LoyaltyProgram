package com.mettl.schemes;


/**
 * @author amahajan
 * 
 */
public class NormalLoyaltyProgram {
	public static long getLoyaltyPoints(double transactionAmount) {
		long points = Math.round(transactionAmount / 100);
		return points;
	}
}
