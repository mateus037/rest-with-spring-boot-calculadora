package br.com.erudio.request.converters;

public class NumberConverter {
	
	public static Double converToDouble(String strNumber) {
		// TODO Auto-generated method stub
		if(strNumber == null) return 0D;
		String number = strNumber.replaceAll(",", ".");
		if (NumberConverter.isNumeric(number)) return Double.parseDouble(number);
		return 1D;
	}
	
	public static boolean isNumeric(String strNumber) {
		// TODO Auto-generated method stub
		if (strNumber == null) return false;
		String number = strNumber.replace(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
	
}
