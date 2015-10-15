package com.mettl.entryPoint;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.mettl.dto.CustomerDetails;
import com.mettl.dto.DtoResult;
import com.mettl.impl.LoyaltyProgramImpl;

/**
 * @author amahajan
 * 
 */
public class EntryPoint {

	private static LoyaltyProgramImpl	impl	= new LoyaltyProgramImpl();

	public static void main(String[] args) {
		List<CustomerDetails> iList = buildInput();
		// this the set of unique card numbers.
		Set<CustomerDetails> uSet = new LinkedHashSet<CustomerDetails>();
		uSet.addAll(iList);

		List<DtoResult> processTransactionList = impl.processTransactionList(
				iList, uSet);
		for (DtoResult customerDetails : processTransactionList) {
			System.out.println(customerDetails);
		}
	}

	/**
	 * This method is used to build the input list.
	 * 
	 * @return iList
	 */
	private static List<CustomerDetails> buildInput() {
		List<CustomerDetails> iList = new ArrayList<CustomerDetails>();
		iList.add(new CustomerDetails("Abhay", "abhay@demo.com", "11001", 7402,
				"22-06-2012 11:23", "2348723"));
		iList.add(new CustomerDetails("", "", "", 5000, "22-06-2012 13:48",
				"3830283"));
		iList.add(new CustomerDetails("Anant", "anant@example.com", "11002",
				3839, "22-06-2012 15:39", "2939303"));
		iList.add(new CustomerDetails("Ashish", "ashish@mettl.com", "11003",
				13890, "22-06-2012 17:15", "2828939"));
		iList.add(new CustomerDetails("", "", "11001", 12083,
				"23-06-2012 11:38", "3839403"));
		iList.add(new CustomerDetails("Abhimanyu", "abhi@mettl.com", "11004",
				33283, "23-06-2012 14:18", "1384839"));
		iList.add(new CustomerDetails("", "", "", 5984, "23-06-2012 19:56",
				"8383939"));
		iList.add(new CustomerDetails("", "", "11003", 38103,
				"24-06-2012 15:38", "9388383"));
		iList.add(new CustomerDetails("Anant", "anant@mettl.com", "11002",
				7281, "24-06-2012 19:18", "2938381"));
		iList.add(new CustomerDetails("", "", "", 1038, "24-06-2012 20:00",
				"8383383"));
		iList.add(new CustomerDetails("Abhijeet", "abhi@mettl.com", "11005",
				17937, "25-06-2012 18:83", "3833838"));

		// Collections.unmodifiableList(iList);
		return iList;
	}
}
