package com.mettl.schemes;

/**
 * @author amahajan
 * 
 */
public class LoyaltyProgramSchemes {
	/**
	 * This method is used to get the loyalty points for gold class customers.
	 * 
	 * @param transactionAmount
	 * @return points
	 */
	public static long getLoyaltyPointsForGoldClass(double transactionAmount) {
		long divisor = Math.round(transactionAmount / 500);
		long points = divisor * 25;
		return points;
	}

	/**
	 * This method is used to get the loyalty points for normal class customers.
	 * 
	 * @param transactionAmount
	 * @return points
	 */
	public static long getLoyaltyPointsForNormalClass(double transactionAmount) {
		long points = Math.round(transactionAmount / 100);
		return points;
	}

	/**
	 * This method is used to get the loyalty points for silver class customers.
	 * 
	 * @param transactionAmount
	 * @return points
	 */
	public static long getLoyaltyPointsForSilverClass(double transactionAmount) {
		long divisor = Math.round(transactionAmount / 100);
		long points = divisor * 2;
		return points;
	}
}
