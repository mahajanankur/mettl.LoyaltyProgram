package com.mettl.schemes;

import com.mettl.contracts.ILoyaltyProgramStrategy;

/**
 * @author amahajan
 *
 */
public class GoldLoyaltyProgram implements ILoyaltyProgramStrategy {
	public long getLoyaltyPoints(double transactionAmount) {
		long divisor = Math.round(transactionAmount / 500);
		long points = divisor * 25;
		return points;
	}
}
