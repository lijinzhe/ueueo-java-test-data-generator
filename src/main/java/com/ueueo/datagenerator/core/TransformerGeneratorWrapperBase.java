package com.ueueo.datagenerator.core;

import com.ueueo.datagenerator.util.Transformer;

/**
 * A class to generate data items transforming the data items obtained from
 * the wrapped {@link Generator} using a {@link Transformer}.
 * 
 * @author Agustin Barto <abarto@gmail.com>
 *
 * @param <S> Type of the data items constructed by the wrapped {@link Generator}.
 * @param <T> The output type of the wrapped {@link Transformer}.
 */
public class TransformerGeneratorWrapperBase<S, T> extends GeneratorWrapperBase<S> implements Generator<T> {
	/**
	 * The wrapped {@link Transformer} instance used to convert the data items
	 * obtained from the wrapped {@link Generator}.
	 */
	protected Transformer<S, T> transformer;
	
	/**
	 * Constructor.
	 * 
	 * @param generator The wrapped {@link Generator}.
	 * @param transformer The {@link Transformer} used to convert the values
	 * obtained from the wrapped generator.
	 */
	public TransformerGeneratorWrapperBase(Generator<S> generator, Transformer<S, T> transformer) {
		super(generator);
		this.transformer = transformer;
	}

	/* (non-Javadoc)
	 * @see com.weiming.datagenerator.core.Generator#generate()
	 */
	@Override
	public T generate() {
		return transformer.transform(generator.generate());
	}
}
