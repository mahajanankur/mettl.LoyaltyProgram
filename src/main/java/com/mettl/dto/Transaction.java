package com.mettl.dto;

/**
 * @author amahajan
 *
 */
public class Transaction {

	private String trxId;

	private long trxAmount;

	private String trxDateTime;

	private long pointsEarned;

	public Transaction(String trxId, long trxAmount, String trxDateTime,
			long pointsEarned) {
		super();
		this.trxId = trxId;
		this.trxAmount = trxAmount;
		this.trxDateTime = trxDateTime;
		this.pointsEarned = pointsEarned;
	}

	public Transaction() {
	}

	/**
	 * @return the trxId
	 */
	public String getTrxId() {
		return trxId;
	}

	/**
	 * @param trxId
	 *            the trxId to set
	 */
	public void setTrxId(String trxId) {
		this.trxId = trxId;
	}

	/**
	 * @return the trxAmount
	 */
	public long getTrxAmount() {
		return trxAmount;
	}

	/**
	 * @param trxAmount
	 *            the trxAmount to set
	 */
	public void setTrxAmount(long trxAmount) {
		this.trxAmount = trxAmount;
	}

	/**
	 * @return the trxDateTime
	 */
	public String getTrxDateTime() {
		return trxDateTime;
	}

	/**
	 * @param trxDateTime
	 *            the trxDateTime to set
	 */
	public void setTrxDateTime(String trxDateTime) {
		this.trxDateTime = trxDateTime;
	}

	/**
	 * @return the pointsEarned
	 */
	public long getPointsEarned() {
		return pointsEarned;
	}

	/**
	 * @param pointsEarned
	 *            the pointsEarned to set
	 */
	public void setPointsEarned(long pointsEarned) {
		this.pointsEarned = pointsEarned;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Transaction [trxId=" + trxId + ", trxAmount=" + trxAmount
				+ ", trxDateTime=" + trxDateTime + ", pointsEarned="
				+ pointsEarned + "]";
	}

}
