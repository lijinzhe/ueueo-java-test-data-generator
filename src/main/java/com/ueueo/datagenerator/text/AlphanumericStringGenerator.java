package com.ueueo.datagenerator.text;

import com.ueueo.datagenerator.core.base.Generator;
import org.apache.commons.lang3.RandomStringUtils;

/**
 * Generates random alphanumeric strings as returned by
 * {@link RandomStringUtils#randomAlphanumeric(int)} from the
 * <a href="http://commons.apache.org/lang/">Commons Lang</a> library.
 *
 * @author Agustin Barto <abarto@gmail.com>
 * @see <a href="http://commons.apache.org/lang/">Lang - Home</a>
 */
public class AlphanumericStringGenerator implements Generator<String> {
    /**
     * Length of the generated strings.
     */
    private int count;

    /**
     * Constructor.
     *
     * @param count Length the generated strings.
     */
    public AlphanumericStringGenerator(int count) {
        super();
        this.count = count;
    }

    @Override
    public String generate() {
        return RandomStringUtils.randomAlphanumeric(count);
    }
}
