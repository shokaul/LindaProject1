package com.lindacare.technical.assessment;

public class FooBarQixKata {
	
	public String compute(int number) {
		if (number < 1) {
			throw new IllegalArgumentException("'number' must be greater than 0");
		}
		
		String strNumber = String.valueOf(number);
		if (!isMultiple(number) && !contains(strNumber)) {
			return strNumber.replace('0', '*');
		}
		
		StringBuilder sbResult = new StringBuilder();
		if (number % 3 == 0) sbResult.append("Foo");
		if (number % 5 == 0) sbResult.append("Bar");
		if (number % 7 == 0) sbResult.append("Qix");
		
		String strNumberTranslation = translateThreeFiveSevenZero(strNumber);
		if (strNumberTranslation != null && strNumberTranslation.length() > 0) {
			sbResult.append(strNumberTranslation);
		}
		
		return sbResult.toString();
	}
	
	private String translateThreeFiveSevenZero(String strNumber) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < strNumber.length(); i++) {
			Character charNumber = strNumber.charAt(i);
			switch (charNumber) {
				case '3': sb.append("Foo"); break;
				case '5': sb.append("Bar"); break;
				case '7': sb.append("Qix"); break;
				case '0': sb.append("*"); break;
			}
		}
		return sb.toString();
	}
	
	private boolean isMultiple(int number) {
		return number % 3 == 0 || number % 5 == 0 || number % 7 == 0; 
	}
	
	private boolean contains(String strNumber) {
		return strNumber.contains("3") || strNumber.contains("5") || strNumber.contains("7");
	}
}
