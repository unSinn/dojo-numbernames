package com.noser;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by fabian on 8/4/16.
 */
public class NumberNameTests {

    @Before
    public void init() {
        namer = new NumberNamer();
    }

    NumberNamer namer;

    @Test
    public void zero() {
        String s = namer.printNumberName(0);
        assertThat(s, is("zero"));
    }

    @Test
    public void one() {
        String s = namer.printNumberName(1);
        assertThat(s, is("one"));
    }

    @Test
    public void two() {
        String s = namer.printNumberName(2);
        assertThat(s, is("two"));
    }

    @Test
    public void ten() {
        String s = namer.printNumberName(10);
        assertThat(s, is("ten"));
    }

    @Test
    public void eleven() {
        String s = namer.printNumberName(11);
        assertThat(s, is("eleven"));
    }

    @Test
    public void twenty() {
        String s = namer.printNumberName(20);
        assertThat(s, is("twenty"));
    }

    @Test
    public void twentyone() {
        String s = namer.printNumberName(21);
        assertThat(s, is("twenty one"));
    }

    @Test

    public void twentyfive() {
        String s = namer.printNumberName(25);
        assertThat(s, is("twenty five"));
    }

    @Test
    public void twentynine() {
        String s = namer.printNumberName(29);
        assertThat(s, is("twenty nine"));
    }

    @Test
    public void thirty() {
        String s = namer.printNumberName(30);
        assertThat(s, is("thirty"));
    }


    @Test
    public void onehundredfourtythree() {
        String s = namer.printNumberName(143);
        assertThat(s, is("one hundred fourty three"));
    }
}
