package pl.batok.kata.java;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

@RunWith(JUnitParamsRunner.class)
public class NumberCounterTest {

    @Test
    @Parameters({"1, 1",
                "2,2"})
    public void testCount(int max,int sum) throws Exception {
        NumberCounter nc = new NumberCounter(max);
        assertThat(nc.count()).isEqualTo(sum);
    }
}