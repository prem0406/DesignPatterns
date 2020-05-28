package com.creational.abstractfactory;

import java.util.Optional;

public abstract class CreditCardFactory {
	public static CreditCardFactory getCreditCardFactory(int creditScore) {
	/*	if (creditScore > 700) {
			return new AmexFactory();
		} else {
			return new VisaFactory();
		}*/
		
		 return Optional.of(creditScore).filter(score -> score > 700).map(score ->  (CreditCardFactory) new AmexFactory()).orElseGet(() -> new VisaFactory());
	}
	
	public abstract CreditCard getCreditCard(CardType cardType);
	public abstract CreditCard getValidator(CardType cardType);
}
