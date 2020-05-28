package com.creational.abstractfactory;

public class AmexFactory extends CreditCardFactory {
	@Override
	public CreditCard getCreditCard(CardType cardType) {
		CreditCard creditCard = null;
		switch (cardType) {
			case GOLD: creditCard = new AmexGoldCrediCard();
			break;
			case PLATINUM: creditCard = new AmexPlatinumCrediCard();
			default: creditCard = null;
		}
		return creditCard;
	}

	@Override
	public CreditCard getValidator(CardType cardType) {
		// TODO Auto-generated method stub
		return null;
	}
}
