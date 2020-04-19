package com.ueueo.datagenerator.numbers;

import com.ueueo.datagenerator.core.Generator;
import com.ueueo.datagenerator.core.RandomBasedGeneratorBase;

/**
 * Generates random roman numerals.
 * 
 * @author Agustin Barto <abarto@gmail.com>
 */
public class RomanNumeralGenerator extends RandomBasedGeneratorBase implements Generator<String> {
	/* (non-Javadoc)
	 * @see com.weiming.datagenerator.core.Generator#generate()
	 */
	@Override
	public String generate() {
		StringBuffer stringBuffer = new StringBuffer();
		int decimal = random.nextInt(4000);
		
		while (decimal >= 1000) {
			stringBuffer.append("M");
			decimal -= 1000;
		}
		
		while (decimal >= 900) {
			stringBuffer.append("CM");
			decimal -= 900;
		}

		while (decimal >= 500) {
			stringBuffer.append("D");
			decimal -= 500;
		}

		while (decimal >= 400) {
			stringBuffer.append("CD");
			decimal -= 400;
		}

		while (decimal >= 100) {
			stringBuffer.append("C");
			decimal -= 100;
		}

		while (decimal >= 90) {
			stringBuffer.append("XC");
			decimal -= 90;
		}
		
		while (decimal >= 50) {
			stringBuffer.append("L");
			decimal -= 50;
		}

		while (decimal >= 40) {
			stringBuffer.append("XL");
			decimal -= 40;
		}

		while (decimal >= 10) {
			stringBuffer.append("X");
			decimal -= 10;
		}

		while (decimal >= 9) {
			stringBuffer.append("IX");
			decimal -= 9;
		}

		while (decimal >= 5) {
			stringBuffer.append("V");
			decimal -= 5;
		}

		while (decimal >= 4) {
			stringBuffer.append("IV");
			decimal -= 4;
		}

		while (decimal >= 1) {
			stringBuffer.append("I");
			decimal -= 1;
		}

		return stringBuffer.toString();
	}
}
