package com.mettl.schemes;

import com.mettl.contracts.ILoyaltyProgramStrategy;

/**
 * @author amahajan
 *
 */
public class SilverLoyaltyProgram implements ILoyaltyProgramStrategy {
	public long getLoyaltyPoints(double transactionAmount) {
		long divisor = Math.round(transactionAmount / 100);
		long points = divisor * 2;
		return points;
	}
}
