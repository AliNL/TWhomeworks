package com.tw.practice;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by 思念 on 2016/1/15.
 */
public class NumberCompareTest {

    @Test
    public void should_be_4A0B_when_2345_with_2345() {
        assertEquals(new NumberCompare().compare("2345", "2345"), "4A0B");
    }

    @Test
    public void should_be_0A0B_when_1234_with_5678() {
        assertEquals(new NumberCompare().compare("1234", "5678"), "0A0B");
    }

    @Test
    public void should_be_0A4B_when_2345_with_2345() {
        assertEquals(new NumberCompare().compare("9876", "6789"), "0A4B");
    }

    @Test
    public void should_be_2A2B_when_1245_with_1254() {
        assertEquals(new NumberCompare().compare("1245", "1254"), "2A2B");
    }
}