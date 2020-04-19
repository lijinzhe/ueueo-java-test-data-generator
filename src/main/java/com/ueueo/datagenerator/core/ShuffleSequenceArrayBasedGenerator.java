package com.ueueo.datagenerator.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Generates data items of type <code>T</code> using the values stored in the
 * contained array shuffling its contents. Once all the elements of the
 * array were returned as generated data items, the sequence is restarted.
 * There's also the option to re-shuffle the values after the sequence is
 * exhausted. 
 * 
 * @author Agustin Barto <abarto@gmail.com>
 *
 * @param <T> Type of data item to generate.
 */
public class ShuffleSequenceArrayBasedGenerator<T> extends ArrayBasedGeneratorBase<T> implements Generator<T> {
	/**
	 * Index of the data item contained within the array. 
	 */
	private int index = 0;

	/**
	 * Indicates that the array of values should be re-shuffled after
	 * exhausting the sequence.
	 */
	private Boolean reShuffle;
	
	/**
	 * Constructor.
	 * 
	 * @param reShuffle Indicates that the values should be re-shuffled after
	 * a sequence is exhausted.
	 * @param values An array of values from which to extract the data items.
	 */
	public ShuffleSequenceArrayBasedGenerator(Boolean reShuffle, T... values) {
		super(values);
		
		this.reShuffle = reShuffle;		
		index = 0;
		
		this.shuffleValues();
	}

	/* (non-Javadoc)
	 * @see com.weiming.datagenerator.core.Generator#generate()
	 */
	@Override
	public T generate() {
		T value = values[index++ % values.length];
		
		if (index % values.length == 0 && reShuffle) {
			this.shuffleValues();
		}
		
		return value;
	}
	
	/**
	 * Shuffles the contained array of values.
	 */
	private void shuffleValues() {
		List<T> valuesAsList = Arrays.asList(this.values);
		Collections.shuffle(valuesAsList);
		values = valuesAsList.toArray(this.values);					
	}
}
