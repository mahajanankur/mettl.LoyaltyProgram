package com.mettl.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.mettl.dto.CustomerDetails;
import com.mettl.dto.DtoResult;
import com.mettl.dto.Transaction;

/**
 * @author amahajan
 *
 */
public class LoyaltyProgramImpl {

	public void processTransactionList(List<CustomerDetails> iList,
			Set<CustomerDetails> uSet) {

		List<DtoResult> resultList = new ArrayList<DtoResult>();
		for (CustomerDetails uniqueInfo : uSet) {
			DtoResult dto = new DtoResult();
			String cardNumber = uniqueInfo.getCardNumber();
			long totalAmount = 0;
			// Sub list for transactions detail
			List<Transaction> tranList = new ArrayList<Transaction>();
			for (CustomerDetails listInfo : iList) {
				// card number check -Start
				if (listInfo.getCardNumber().equals(cardNumber)) {
					// check for name and email change - Start
					if (listInfo.getName() != null
							|| !listInfo.getName().equals("")) {
						dto.setCustomerName(listInfo.getName());
						if (listInfo.getEmail() != null
								|| !listInfo.getEmail().equals("")) {
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
					//some attributes are still pending
					tranList.add(transaction);
				}
				// card number check -End
				//setting sun transaction list to result dto.
				dto.setTransactions(tranList);

			}
		}

	}

}
