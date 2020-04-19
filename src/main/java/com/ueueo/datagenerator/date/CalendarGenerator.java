package com.ueueo.datagenerator.date;

import com.ueueo.datagenerator.core.base.Generator;

import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;

/**
 * Generates {@link Calendar} instances between two given dates.
 *
 * @author Agustin Barto <abarto@gmail.com>
 */
public class CalendarGenerator implements Generator<Calendar> {

    /** The random. {@link Random} instance to generate values within the given period. */
    private Random random;

    /**
     * The start of the period (as returned by {@link Calendar#getTimeInMillis()} that
     * contains the generated data items.
     */
    private Long startTime;

    /**
     * The end of the period (as returned by {@link Calendar#getTimeInMillis()} that
     * contains the generated data items.
     */
    private Long endTime;

    /** The time zone. */
    private TimeZone timeZone;

    /**
     * Instantiates a new calendar generator.
     *
     * @param startTime the start time
     * @param endTime   the end time
     */
    public CalendarGenerator(Calendar startTime, Calendar endTime) {
        super();
        this.startTime = startTime.getTimeInMillis();
        this.endTime = endTime.getTimeInMillis();
        timeZone = TimeZone.getDefault();
        random = new Random();
    }

    /**
     * Instantiates a new calendar generator.
     *
     * @param startTime the start time
     * @param endTime   the end time
     * @param timeZone  the time zone
     */
    public CalendarGenerator(Calendar startTime, Calendar endTime, TimeZone timeZone) {
        super();
        this.startTime = startTime.getTimeInMillis();
        this.endTime = endTime.getTimeInMillis();
        this.timeZone = timeZone;
        random = new Random();
    }

    /**
     * Instantiates a new calendar generator.
     *
     * @param startTime the start time
     * @param endTime   the end time
     * @param random    the random
     */
    public CalendarGenerator(Calendar startTime, Calendar endTime, Random random) {
        super();
        this.random = random;
        this.startTime = startTime.getTimeInMillis();
        this.endTime = endTime.getTimeInMillis();
        timeZone = TimeZone.getDefault();
    }

    /**
     * Instantiates a new calendar generator.
     *
     * @param startTime the start time
     * @param endTime   the end time
     * @param timeZone  the time zone
     * @param random    the random
     */
    public CalendarGenerator(Calendar startTime, Calendar endTime, TimeZone timeZone, Random random) {
        super();
        this.random = random;
        this.startTime = startTime.getTimeInMillis();
        this.endTime = endTime.getTimeInMillis();
        this.timeZone = timeZone;
    }

    @Override
    public Calendar generate() {
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(startTime + ((Double) ((endTime - startTime) * random.nextDouble())).longValue());

        return calendar;
    }

}
