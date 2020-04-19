package com.ueueo.datagenerator.numbers;

import com.ueueo.datagenerator.core.Generator;

/**
 * Generate {@link Long} data items in a sequence starting from a specific
 * point and
 *
 * @author Agustin Barto <abarto@gmail.com>
 */
public class LongSequenceGenerator implements Generator<Long> {
    /**
     * Current value of the sequence.
     */
    private Long currentValue;

    /**
     * Current step length.
     */
    private Long step;

    /**
     * Constructor. The sequence is set to start at 0 and use 1 as step.
     */
    public LongSequenceGenerator() {
        currentValue = 0L;
        step = 1L;
    }

    /**
     * Constructor. Uses the parameter as the starting point of the sequence
     * and sets the step to 1.
     *
     * @param startFrom The starting point of the generated sequence.
     */
    public LongSequenceGenerator(Long startFrom) {
        currentValue = startFrom;
        step = 1L;
    }

    /**
     * Constructor.
     *
     * @param startFrom Starting point of the generated sequence.
     * @param step      The step to use between each generated data item of the
     *                  sequence.
     */
    public LongSequenceGenerator(Long startFrom, Long step) {
        currentValue = startFrom;
        this.step = step;
    }

    @Override
    public Long generate() {
        Long value = currentValue;
        currentValue += step;

        return value;
    }
}
