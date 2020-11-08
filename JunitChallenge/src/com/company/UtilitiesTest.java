package com.company;

import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities util;

    @org.junit.Before
    public  void setup(){
        util = new Utilities();
    }

    @org.junit.Test
    public void everyNthChar() {

        char[] output = util.everyNthChar(new char[] {'h','e','l','l','o'},2);
        assertArrayEquals(new char[] {'e','l'},output);
        char[] output2 = util.everyNthChar(new char[] {'h','e','l','l','o'},8);
        assertArrayEquals(new char[] {'h','e','l','l','o'},output2);
    }

    @org.junit.Test
    public void removePairs() {

        assertEquals("ABCDEF",util.removePairs("AABCDDEF"));
        assertNull(null, util.removePairs(null));
        assertEquals("A",util.removePairs("A"));
        assertEquals("",util.removePairs(""));
    }

    @org.junit.Test
    public void converter() {

    assertEquals(300,util.converter(10,5));
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void converter_arithmeticException() throws Exception{

        util.converter(10,0);
    }
    @org.junit.Test
    public void nullIfOddLength() {

        assertNull(util.nullIfOddLength("odd"));
        assertNotNull(util.nullIfOddLength("even"));}
}