package com.creational.abstractfactory;

public class VisaFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		
		switch (cardType) {
		case GOLD: return new VisaGoldCrediCard();
		
		case PLATINUM: return new VisaPlatinumCreditCard();
		}
		return null;
		
		
	}

	@Override
	public CreditCard getValidator(CardType cardType) {
		// TODO Auto-generated method stub
		return null;
	}

}
