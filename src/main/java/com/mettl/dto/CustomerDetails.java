package com.mettl.dto;

/**
 * @author amahajan
 *
 */
public class CustomerDetails {

	private String name;

	private String email;

	private String cardNumber;

	private long pAmount;

	private String purchageDate;

	private String transactionId;

	public CustomerDetails(String name, String email, String cardNumber,
			long pAmount, String purchageDate, String transactionId) {
		super();
		this.name = name;
		this.email = email;
		this.cardNumber = cardNumber;
		this.pAmount = pAmount;
		this.purchageDate = purchageDate;
		this.transactionId = transactionId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * @param cardNumber
	 *            the cardNumber to set
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * @return the pAmount
	 */
	public long getpAmount() {
		return pAmount;
	}

	/**
	 * @param pAmount
	 *            the pAmount to set
	 */
	public void setpAmount(long pAmount) {
		this.pAmount = pAmount;
	}

	/**
	 * @return the purchageDate
	 */
	public String getPurchageDate() {
		return purchageDate;
	}

	/**
	 * @param purchageDate
	 *            the purchageDate to set
	 */
	public void setPurchageDate(String purchageDate) {
		this.purchageDate = purchageDate;
	}

	/**
	 * @return the transactionId
	 */
	public String getTransactionId() {
		return transactionId;
	}

	/**
	 * @param transactionId
	 *            the transactionId to set
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CustomerDetails [name=" + name + ", email=" + email
				+ ", cardNumber=" + cardNumber + ", pAmount=" + pAmount
				+ ", purchageDate=" + purchageDate + ", transactionId="
				+ transactionId + "]";
	}

	/*
	 * Used hashcode() and equals() to get unique collection based on loyalty
	 * card number.
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((cardNumber == null) ? 0 : cardNumber.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerDetails other = (CustomerDetails) obj;
		if (cardNumber == null) {
			if (other.cardNumber != null)
				return false;
		}
		else if (!cardNumber.equals(other.cardNumber))
			return false;
		return true;
	}

}
