package com.company;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class UtilitiesTestParametrized {

    private Utilities util;

    private String input;
    private String output;

    public UtilitiesTestParametrized(String input,String output){
        this.input = input;
        this.output = output;
    }

    @org.junit.Before
    public void setup(){
        util = new Utilities();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions(){
        return Arrays.asList(new Object[][]{
            {"ABCDEFF","ABCDEF"},
                {"A","A"}
        });
    }

    @org.junit.Test
    public void removePairs() throws Exception{
        assertEquals(output,util.removePairs(input));
    }
}
