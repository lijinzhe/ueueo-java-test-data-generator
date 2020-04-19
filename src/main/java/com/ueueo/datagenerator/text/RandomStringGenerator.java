package com.ueueo.datagenerator.text;

import com.ueueo.datagenerator.core.Generator;
import org.apache.commons.lang3.RandomStringUtils;

/**
 * Generates random strings as returned by
 * {@link RandomStringUtils#random(int, char[])} from the
 * <a href="http://commons.apache.org/lang/">Commons Lang</a> library.
 * 
 * @author Agustin Barto <abarto@gmail.com>
 * @see <a href="http://commons.apache.org/lang/">Lang - Home</a>
 */
public class RandomStringGenerator implements Generator<String> {
	/**
	 * Length of the generated strings.
	 */
	private int count;

	/**
	 * The character array containing the set of characters to use. 
	 */
	private char[] chars;
	
	/**
	 * Constructor.
	 * 
	 * @param count The length of random string to create.
	 * @param chars The character array containing the set of characters to use.
	 */
	public RandomStringGenerator(int count, char[] chars) {
		this.count = count;
		this.chars = chars;
	}

	/**
	 * Constructor.
	 * 
	 * @param count The length of random string to create.
	 * @param chars the String containing the set of characters to use.
	 */
	public RandomStringGenerator(int count, String chars) {
		this.count = count;
		this.chars = chars.toCharArray();
	}

	/* (non-Javadoc)
	 * @see com.weiming.datagenerator.core.Generator#generate()
	 */
	@Override
	public String generate() {
		return RandomStringUtils.random(count, chars);
	}
}
