package KataSGCIB.KataSGCIB;

import java.util.TreeMap;

/**
 * Roman Numerals Converter
 *
 */
public class App {

	/** error message **/
	public static final String INVALID_NUMBER = "The input must be in the range of 1 - 3999";

	/** conversion map **/
	private static final TreeMap<Integer, String> decimalRomanMap = new TreeMap<Integer, String>();

	static {

		decimalRomanMap.put(1000, "M");
		decimalRomanMap.put(900, "CM");
		decimalRomanMap.put(500, "D");
		decimalRomanMap.put(400, "CD");
		decimalRomanMap.put(100, "C");
		decimalRomanMap.put(90, "XC");
		decimalRomanMap.put(50, "L");
		decimalRomanMap.put(40, "XL");
		decimalRomanMap.put(10, "X");
		decimalRomanMap.put(9, "IX");
		decimalRomanMap.put(5, "V");
		decimalRomanMap.put(4, "IV");
		decimalRomanMap.put(1, "I");

	}

	/**
	 * convert decimals to Roman numerals
	 * 
	 * @param number
	 *            number to convert
	 * @return roman corresponding number
	 */
	public static String roman(int number) {
		// check the input
		if(number<1 || number>3999){
			throw new IllegalArgumentException(INVALID_NUMBER);
		}
		// get the  nearest number from the map : ex for 1954--> 1000
		int l = decimalRomanMap.floorKey(number);
		if (number == l) {
			// end of  recursion , smallest roman number found : ex for 1954--> 4
			return decimalRomanMap.get(number);
		}
		// continue building the roman number substracting bigest number found: ex for 1954--> M + roman(954);
		return decimalRomanMap.get(l) + roman(number - l);

	}

}
