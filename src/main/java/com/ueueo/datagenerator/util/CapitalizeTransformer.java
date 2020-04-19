package com.ueueo.datagenerator.util;

/**
 * Capitalizes the input string. Based on Commons Lang's StringUtils.capitalize.
 * 
 * @author Agustin Barto <abarto@gmail.com>
 */
public class CapitalizeTransformer implements Transformer<String, String> {
	/* (non-Javadoc)
	 * @see com.weiming.datagenerator.util.Transformer#transform(java.lang.Object)
	 */
	@Override
	public String transform(String input) {
		return new StringBuffer(input.length())
				.append(Character.toTitleCase(input.charAt(0)))
				.append(input.substring(1)).toString();
	}
}
