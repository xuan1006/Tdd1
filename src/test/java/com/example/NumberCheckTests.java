package com.example;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class NumberCheckTests {

    @Test
    public void shouldBeBiggerThanZero(){
        NumberCheck numberCheck = new NumberCheck();
        assertEquals("Positive", numberCheck.check(1));
    }

    @Test
    public void shouldBeSmallZero(){
        NumberCheck numberCheck = new NumberCheck();
        assertEquals("Negative", numberCheck.check(-1));
    }

    @Test
    public void shouldBeEqualZero(){
        NumberCheck numberCheck = new NumberCheck();
        assertEquals("Equal", numberCheck.check(0));
    }
}
