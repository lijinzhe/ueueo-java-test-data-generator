package com.ueueo.datagenerator.numbers;

import com.ueueo.datagenerator.core.Generator;
import com.ueueo.datagenerator.core.GeneratorWrapperBase;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;

/**
 * Generates a formatted Number string using the supplied {@link NumberFormat}
 * instance.
 * 
 * @author Agustin Barto <abarto@gmail.com>
 *
 * @param <T> Type of data item to be given to {@link DateFormat#format(Date)}
 * @see DateFormat
 */
public class FormattedNumberGenerator<T extends Number> extends GeneratorWrapperBase<T> implements Generator<String> {
	
	/** The number format. */
	private NumberFormat numberFormat;

	/**
	 * Instantiates a new formatted number generator.
	 *
	 * @param generator the generator
	 * @param numberFormat the number format
	 */
	public FormattedNumberGenerator(Generator<T> generator, NumberFormat numberFormat) {
		super(generator);
		this.numberFormat = numberFormat;
	}

	/* (non-Javadoc)
	 * @see com.weiming.datagenerator.core.Generator#generate()
	 */
	@Override
	public String generate() {
		return numberFormat.format(generator.generate());
	}
}
