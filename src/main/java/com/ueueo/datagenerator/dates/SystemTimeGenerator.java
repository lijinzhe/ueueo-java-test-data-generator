package com.ueueo.datagenerator.dates;

import com.ueueo.datagenerator.core.Generator;

/**
 * Generates {@link Long} calling {@link System#currentTimeMillis()}.
 * 
 * @author Agustin Barto <abarto@gmail.com>
 */
public class SystemTimeGenerator implements Generator<Long> {
	/* (non-Javadoc)
	 * @see com.weiming.datagenerator.core.Generator#generate()
	 */
	@Override
	public Long generate() {
		return System.currentTimeMillis();
	}

}
