package pl.batok.kata.java;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.fail;
import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;


@RunWith(JUnitParamsRunner.class)
public class StringCalculatorTest {


    @Test
    @Parameters(method = "numbersToSum")
    public void shouldReturnSomething(String input, int result) throws Exception {
        // Given
        StringCalculator sc = new StringCalculator();
        //When & Then
        assertThat(sc.add(input)).isEqualTo(result);
    }


    private Object[] numbersToSum() throws Exception{
        return new Object[]{
                new Object[]{"", 0},
                new Object[]{"1", 1},
                new Object[]{"2",2},
                new Object[]{"2,3",5},
                new Object[]{"1,2,3,4",10},
                new Object[]{"1\n2,3,4",10},
                new Object[]{"//;\n1;2;3",6}
        };
    }





    @Test(expected = NumberFormatException.class)
    public void shouldNotParseNumberIfToMuchDelimeters() throws Exception {
        // Given
        StringCalculator sc = new StringCalculator();
        // When
        assertThat(sc.add("1,2,\n,3")).isEqualTo(-100);
        fail("Reached");
    }

    @Test
    public void shouldThrowExceptionIfNumberBellow0() {
        // Given
        StringCalculator sc = new StringCalculator();
        String toAdd = new String("-1,2,3,4,-10");
        // When
        try {
            sc.add(toAdd);
            fail("Not Reached exception expected with numbers");
        } catch (Exception e) {
            assertThat(e.getMessage()).contains("-1,-10");
        }
        // Then

    }


}