package com.mettl.contracts;

/**
 * @author amahajan
 *
 */
public interface ILoyaltyProgramStrategy {
	public long getLoyaltyPoints(double transactionAmount);
}
