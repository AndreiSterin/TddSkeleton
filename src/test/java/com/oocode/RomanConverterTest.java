package com.oocode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanConverterTest {

    @Test
    public void convertsOne() {
        assertEquals("I", RomanConverter.convertToRoman(1));
    }
    @Test
    public void convertsTen() {
        assertEquals(RomanConverter.convertToRoman(10), "X");
    }

    @Test
    public void convertsTwo() {
        assertEquals(RomanConverter.convertToRoman(2), "II");
    }

    @Test
    public void convertsThirteen() {
        assertEquals(RomanConverter.convertToRoman(13), "XIII");
    }

    @Test
    public void convertsFour() {
        assertEquals(RomanConverter.convertToRoman(4), "IV");
    }
    @Test
    public void convertsFifteen() {
        assertEquals(RomanConverter.convertToRoman(15), "XV");
    }    @Test
    public void convertsSeventeen() {
        assertEquals(RomanConverter.convertToRoman(17), "XVII");
    }
}
