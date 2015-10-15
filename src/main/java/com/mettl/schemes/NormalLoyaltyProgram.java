package com.mettl.schemes;

import com.mettl.contracts.ILoyaltyProgramStrategy;

/**
 * @author amahajan
 *
 */
public class NormalLoyaltyProgram implements ILoyaltyProgramStrategy {
	public long getLoyaltyPoints(double transactionAmount) {
		long points = Math.round(transactionAmount / 100);
		return points;
	}
}
