package com.ueueo.datagenerator.numbers;

import com.ueueo.datagenerator.core.Generator;
import com.ueueo.datagenerator.core.RandomBasedGeneratorBase;

import java.math.BigInteger;

/**
 * Generates {@link BigInteger} data items uniformly distributed over the range
 * 0 to (2^numBits - 1), inclusive using {@link BigInteger#BigInteger(int, java.util.Random)}.
 *
 * @author Agustin Barto <abarto@gmail.com>
 * @see BigInteger
 */
public class BigIntegerGenerator extends RandomBasedGeneratorBase implements Generator<BigInteger> {
    /**
     * Number of bits to be supplied to the {@link BigInteger} constructor.
     */
    private int numBits;

    /**
     * Constructor.
     *
     * @param numBits Number of bits to be supplied to the {@link BigInteger} constructor.
     *
     * @see BigInteger#BigInteger(int, java.util.Random)
     */
    public BigIntegerGenerator(int numBits) {
        this.numBits = numBits;
    }

    @Override
    public BigInteger generate() {
        return new BigInteger(numBits, random);
    }
}
