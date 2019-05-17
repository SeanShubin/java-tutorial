package com.seanshubin.tutorial.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeStringTest {
    @Test
    void sample() {
        // given
        String input = "12:32 34:01 15:23 9:27 55:22 25:56";
        String expected = "2:32:41";

        // when

        String actual = TimeString.stringOfTimesToSummedString(input);

        // then
        assertEquals(expected, actual);
    }
}