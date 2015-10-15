package com.mettl.dto;

import java.util.List;

import com.mettl.type.CustomerClass;

/**
 * @author amahajan
 *
 */
public class DtoResult {

	private String customerName;

	private String email;

	private long totalPoints;

	private CustomerClass customerClass;

	private List<Transaction> transactions;

	//Parameterized constructor
	public DtoResult(String customerName, String email, long totalPoints,
			CustomerClass customerClass, List<Transaction> transactions) {
		super();
		this.customerName = customerName;
		this.email = email;
		this.totalPoints = totalPoints;
		this.customerClass = customerClass;
		this.transactions = transactions;
	}

	//Default constructor
	public DtoResult() {

	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName
	 *            the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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
	 * @return the totalPoints
	 */
	public long getTotalPoints() {
		return totalPoints;
	}

	/**
	 * @param totalPoints
	 *            the totalPoints to set
	 */
	public void setTotalPoints(long totalPoints) {
		this.totalPoints = totalPoints;
	}

	/**
	 * @return the customerClass
	 */
	public CustomerClass getCustomerClass() {
		return customerClass;
	}

	/**
	 * @param customerClass
	 *            the customerClass to set
	 */
	public void setCustomerClass(CustomerClass customerClass) {
		this.customerClass = customerClass;
	}

	/**
	 * @return the transactions
	 */
	public List<Transaction> getTransactions() {
		return transactions;
	}

	/**
	 * @param transactions
	 *            the transactions to set
	 */
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DtoResult [customerName=" + customerName + ", email=" + email
				+ ", totalPoints=" + totalPoints + ", customerClass="
				+ customerClass + ", transactions=" + transactions + "]";
	}

}
