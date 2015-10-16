package com.mettl.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.mettl.dto.CustomerDetails;
import com.mettl.dto.DtoResult;
import com.mettl.dto.Transaction;
import com.mettl.schemes.LoyaltyProgramSchemes;
import com.mettl.type.CustomerClass;

/**
 * @author amahajan
 * 
 */
public class LoyaltyProgramImpl {

	/**
	 * This method is used to process the input list to get the result.
	 * 
	 * @param iList
	 * @param uSet
	 * @return resultList
	 */
	public List<DtoResult> processTransactionList(List<CustomerDetails> iList,
			Set<CustomerDetails> uSet) {
		List<DtoResult> resultList = new ArrayList<DtoResult>();
		for (CustomerDetails uniqueInfo : uSet) {
			DtoResult dto = new DtoResult();
			String cardNumber = uniqueInfo.getCardNumber();
			long totalAmount = 0;
			// Initial loyalty point value is 100 because customer gets this as
			// joining bonus.
			long totLPoints = 100;
			// Sub list for transactions detail
			List<Transaction> tranList = new ArrayList<Transaction>();
			for (CustomerDetails listInfo : iList) {
				// card number check -Start
				if (listInfo.getCardNumber().equals(cardNumber)) {
					// check for name and email change - Start
					if (listInfo.getName() != null
							&& !listInfo.getName().equals("")) {
						dto.setCustomerName(listInfo.getName());
						if (listInfo.getEmail() != null
								&& !listInfo.getEmail().equals("")) {
							dto.setEmail(listInfo.getEmail());
						}
					}
					// check for name and email change - End
					totalAmount += listInfo.getpAmount();
					// setting sub transaction list details
					Transaction transaction = new Transaction();
					transaction.setTrxId(listInfo.getTransactionId());
					transaction.setTrxAmount(listInfo.getpAmount());
					transaction.setTrxDateTime(listInfo.getPurchageDate());
					// some attributes are still pending
					tranList.add(transaction);
				}
				// card number check -End
			}

			dto.setTotalTAmount(totalAmount);
			// setting the customer class based on the total transaction
			// amount.
			CustomerClass cClass = assignCustomerClassByAmount(totalAmount);
			dto.setCustomerClass(cClass);
			// Calculate loyalty points
			totLPoints += getLoyaltyPoints(cClass, totalAmount);
			dto.setTotalPoints(totLPoints);
			// calculating sub list loyalty points
			for (Transaction transaction : tranList) {
				long loyaltyPoints = getLoyaltyPoints(cClass,
						transaction.getTrxAmount());
				transaction.setPointsEarned(loyaltyPoints);
			}

			// setting sub transaction list to result dto.
			dto.setTransactions(tranList);
			// resultList
			resultList.add(dto);
		}
		return resultList;
	}

	/**
	 * This method is used to assign the customer class to a customer based on
	 * the total transaction amount.
	 * 
	 * @param totalAmount
	 * @return cusClass
	 */
	private CustomerClass assignCustomerClassByAmount(long totalAmount) {
		CustomerClass cusClass = null;
		if (totalAmount >= 50000) {
			cusClass = CustomerClass.GOLD;
		}
		else if (totalAmount >= 25000 && totalAmount < 50000) {
			cusClass = CustomerClass.SILVER;
		}
		else if (totalAmount < 25000) {
			cusClass = CustomerClass.NORMAL;
		}
		return cusClass;
	}

	/**
	 * This method is used to calculate loyalty points for a given transaction
	 * amount and customer class.
	 * 
	 * @param cClass
	 * @param totalAmount
	 * @return points
	 */
	private long getLoyaltyPoints(CustomerClass cClass, long totalAmount) {
		long loyPoints = 0;
		if (cClass == CustomerClass.GOLD) {
			loyPoints = LoyaltyProgramSchemes
					.getLoyaltyPointsForGoldClass(totalAmount);
		}
		else if (cClass == CustomerClass.SILVER) {
			loyPoints = LoyaltyProgramSchemes
					.getLoyaltyPointsForSilverClass(totalAmount);
		}
		else if (cClass == CustomerClass.NORMAL) {
			loyPoints = LoyaltyProgramSchemes
					.getLoyaltyPointsForNormalClass(totalAmount);
		}

		return loyPoints;
	}
}
