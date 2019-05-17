package com.seanshubin.tutorial.java;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartsNeededForTimeStringTest {
    @Test
    void splitAStringBasedOnACharacter(){
        // given
        String splitMe = "this-is-a-test";
        String[] expected = new String[]{"this", "is", "a", "test"};

        // when
        String[] actual = splitMe.split("-");

        // then
        assertEquals(expected.length, actual.length);
        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
        assertEquals(expected[2], actual[2]);
        assertEquals(expected[3], actual[3]);
    }

    @Test
    void modulo(){
        assertEquals(0, 0 % 3);
        assertEquals(1, 1 % 3);
        assertEquals(2, 2 % 3);
        assertEquals(0, 3 % 3);
        assertEquals(1, 4 % 3);
        assertEquals(2, 5 % 3);
        assertEquals(0, 6 % 3);
        assertEquals(1, 7 % 3);
        assertEquals(2, 8 % 3);
    }
    @Test
    void div(){
        assertEquals(0, 0/3);
        assertEquals(0, 1 / 3);
        assertEquals(0, 2 / 3);
        assertEquals(1, 3 / 3);
        assertEquals(1, 4 / 3);
        assertEquals(1, 5 / 3);
        assertEquals(2, 6 / 3);
        assertEquals(2, 7 / 3);
        assertEquals(2, 8 / 3);
    }
    @Test
    void accumulatingLoop(){
        // given
        int expected = 120;

        // when
        int accumulator = 1;
        for(int i = 1; i<=5;i++){
            accumulator *= i;
        }

        // then
        assertEquals(expected, accumulator);
    }
    @Test
    void concatenate(){
        // given
        String a= "aaa";
        String b = "bbb";
        String expected = "aaabbb";

        // when
        String actual = a + b;

        // then
        assertEquals(expected, actual);
    }

    @Test
    void iterate(){
        // given
        int[] array = new int[]{1,2,3,4,5};
        int expected = 120;

        // when
        int actual = 1;
        for (int element : array) {
            actual *= element;
        }

        // then
        assertEquals(expected, actual);
    }

    int makeNumber(int x, int y, int z){
        return x * 100 + y * 10 + z;
    }

    @Test
    void function(){
        // given
        int a = 1;
        int b = 2;
        int c = 3;
        int expected = 123;

        // when
        int actual = makeNumber(a,b,c);

        // then
        assertEquals(expected, actual);
    }

    @Test
    void intToString(){
        // given
        int x = 123;
        String expected = "123";

        // when
        String actual = Integer.toString(x);

        // then
        assertEquals(expected, actual);
    }

    @Test
    void stringToInt(){
        // given
        String x = "123";
        int expected = 123;

        // when
        int actual = Integer.parseInt(x);

        // then
        assertEquals(expected, actual);
    }
}
