package com.ueueo.datagenerator.people;

import com.ueueo.datagenerator.core.base.Generator;
import org.apache.commons.lang3.RandomStringUtils;

/**
 * Generates initials like A., B., etc.
 *
 * @author Agustin Barto <abarto@gmail.com>
 */
public class InitialGenerator implements Generator<String> {
    @Override
    public String generate() {
        return RandomStringUtils.randomAlphabetic(1) + ".";
    }
}
