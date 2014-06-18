
/**
 * BankWSDLFileSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package org.example.www.bankwsdlfile;

import java.sql.Date;
import java.util.Calendar;

/**
 *  BankWSDLFileSkeleton java skeleton for the axisService
 */
public class BankWSDLFileSkeleton{


	/**
	 * Auto generated method signature
	 * 
	 * @param transferMoney 
	 * @return transferMoneyResponse 
	 */

	public org.example.www.bankwsdlfile.TransferMoneyResponse transferMoney
	(org.example.www.bankwsdlfile.TransferMoney transferMoney)
	{
		org.example.www.bankwsdlfile.TransferMoneyResponse response = new org.example.www.bankwsdlfile.TransferMoneyResponse();
		
		boolean flag = true;
		String errorExpalnation = "";
		
		//setting today's date
		java.util.Date utilToday = new java.util.Date();
	    java.sql.Date sqlToday = new java.sql.Date(utilToday.getTime());
		
		double amount = transferMoney.getAmount();
		CreditCardType RetailerCard = transferMoney.getRetailerCreditCard();
		CreditCardType WineProducerCard = transferMoney.getWineProducerCreditCard();
		
		//validation of the RetailerCard
		if (RetailerCard.getName_Surname().length()>26) {
			flag = false;
			errorExpalnation = "Too long Name!";
		}
		if (RetailerCard.getCardNumber().length()>16) {
			flag = false;
			errorExpalnation = "Too long CardNumber!";
		}
		if (RetailerCard.getSecurityCode().length()>4) {
			flag = false;
			errorExpalnation = "Too long SecurityCode!";
		}
		if (RetailerCard.getExpirationDate().compareTo(sqlToday) <0){
			flag = false;
			errorExpalnation = "Expiration Date has passed!";
		}
		
		//validation of the WineProducerCard
		if (WineProducerCard.getName_Surname().length()>26) {
			flag = false;
			errorExpalnation = "Too long Name!";
		}
		if (WineProducerCard.getCardNumber().length()>16) {
			flag = false;
			errorExpalnation = "Too long CardNumber!";
		}
		if (WineProducerCard.getSecurityCode().length()>4) {
			flag = false;
			errorExpalnation = "Too long SecurityCode!";
		}
		if (WineProducerCard.getExpirationDate().compareTo(sqlToday) <0){
			flag = false;
			errorExpalnation = "Expiration Date has passed!";
		}
		
		//only transfers above 1000 are successful
		if (amount < 1000){
			flag = false;
			errorExpalnation = " Not large enough amount of money!";
		}
		
		//return the right response
		if (flag == true){
			response.setTransferResponse("Transfer executed successfully!");
		} else {
			String str = "No Transfer execution!";
			str = str.concat(errorExpalnation);
			response.setTransferResponse(str);
		}
		return response;
}

}
