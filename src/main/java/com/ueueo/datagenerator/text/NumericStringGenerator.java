package com.ueueo.datagenerator.text;

import com.ueueo.datagenerator.core.Generator;
import org.apache.commons.lang3.RandomStringUtils;

/**
 * Generates random numeric strings as returned by
 * {@link RandomStringUtils#randomNumeric(int)} from the
 * <a href="http://commons.apache.org/lang/">Commons Lang</a> library.
 *
 * @author Agustin Barto <abarto@gmail.com>
 * @see <a href="http://commons.apache.org/lang/">Lang - Home</a>
 */
public class NumericStringGenerator implements Generator<String> {
    /**
     * Length of the generated strings.
     */
    private int count;

    /**
     * Constructor.
     *
     * @param count Length the generated strings.
     */
    public NumericStringGenerator(int count) {
        super();
        this.count = count;
    }

    @Override
    public String generate() {
        return RandomStringUtils.randomNumeric(count);
    }
}
