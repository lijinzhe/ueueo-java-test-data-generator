package com.ueueo.datagenerator.people;

import com.ueueo.datagenerator.core.Generator;

import java.util.Random;

/**
 * Generates random male and female names (with equal probability) using a
 * {@link EnglishMaleNameGenerator} and a {@link EnglishFemaleNameGenerator}.
 *
 * @author Agustin Barto <abarto@gmail.com>
 */
public class EnglishNameGenerator implements Generator<String> {
    /**
     * A random number generator used to decide wether to generate a male or
     * female name.
     */
    private Random random = new Random();

    /**
     * Male name generator.
     */
    private Generator<String> maleNameGenerator = new EnglishMaleNameGenerator();

    /**
     * Female name generator.
     */
    private Generator<String> femaleNameGenerator = new EnglishFemaleNameGenerator();

    /*
     * (non-Javadoc)
     *
     * @see com.weiming.datagenerator.core.Generator#generate()
     */
    @Override
    public String generate() {
        return (random.nextDouble() < 0.5) ? maleNameGenerator.generate()
                : femaleNameGenerator.generate();
    }

}
