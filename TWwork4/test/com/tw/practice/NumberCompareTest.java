package com.tw.practice;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by 思念 on 2016/1/15.
 */
public class NumberCompareTest {

    @Test
    public void should_be_4A0B_when_2345_with_2345() {
        String s = new NumberCompare().compare("2345", "2345");
        assertEquals(s, "4A0B");
    }

    @Test
    public void should_be_0A0B_when_1234_with_5678() {
        String s = new NumberCompare().compare("1234", "5678");
        assertEquals(s, "0A0B");
    }

    @Test
    public void should_be_0A4B_when_2345_with_2345() {
        String s = new NumberCompare().compare("9876", "6789");
        assertEquals(s, "0A4B");
    }

    @Test
    public void should_be_2A2B_when_1245_with_1254() {
        String s = new NumberCompare().compare("1245", "1254");
        assertEquals(s, "2A2B");
    }
}