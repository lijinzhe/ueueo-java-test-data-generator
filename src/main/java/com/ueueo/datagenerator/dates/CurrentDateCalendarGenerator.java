package com.ueueo.datagenerator.dates;

import com.ueueo.datagenerator.core.Generator;

import java.util.Calendar;
import java.util.TimeZone;

/**
 * Generates {@link Calendar} with the current date/time with each call to
 * {@link #generate()}.
 *
 * @author Agustin Barto <abarto@gmail.com>
 */
public class CurrentDateCalendarGenerator implements Generator<Calendar> {

    /** The time zone. */
    private TimeZone timeZone;

    /**
     * Instantiates a new current date calendar generator.
     */
    public CurrentDateCalendarGenerator() {
        super();

        timeZone = TimeZone.getDefault();
    }

    /**
     * Instantiates a new current date calendar generator.
     *
     * @param timeZone the time zone
     */
    public CurrentDateCalendarGenerator(TimeZone timeZone) {
        super();
        this.timeZone = timeZone;
    }

    @Override
    public Calendar generate() {
        return Calendar.getInstance(timeZone);
    }
}
