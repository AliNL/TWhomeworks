package com.tw.practice;

import org.junit.Before;
import org.junit.Test;
import org.junit.internal.matchers.StringContains;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by 思念 on 2015/12/26.
 */
public class NumberGeneratorTest {

    private NumberGenerator numberGenerator;

    @Before
    public void setUp() throws Exception {
        numberGenerator = new NumberGenerator();
    }

    @Test
    public void should_have_four_charactor() {
        String numbers = numberGenerator.generate();
        assertEquals(numbers.length(), 4);
    }

    @Test
    public void should_be_numbers() {
        String numbers = numberGenerator.generate();
        assertTrue(numbers.matches("\\d+"));
    }

    @Test
    public void should_have_different_numbers() {
        String numbers = numberGenerator.generate();
        assertTrue(isUniqueEachOther(numbers));
    }

    private boolean isUniqueEachOther(String numbers) {
        for (int i = 0; i < numbers.length(); i++)
            if (numbers.substring(i + 1, numbers.length()).indexOf(numbers.charAt(i)) > -1)
                return false;
        return true;
    }

    @Test
    public void should_be_random() {
        String number1 = new NumberGenerator().generate();
        String number2 = new NumberGenerator().generate();
        assertFalse(number1.equals(number2));
    }

}