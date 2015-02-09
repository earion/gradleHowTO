package pl.batok.kata.java;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

@RunWith(JUnitParamsRunner.class)



public class AnimalsCounterTest {

    @Test
    @Parameters(method = "animalGenerator")
    public void testCountAnimalsStartsWithLetter(String [] animals, String [] expectedAnimals, String fix) throws Exception {
        AnimalsCounter ac = new AnimalsCounter(animals);
        assertThat(ac.countAnimalsStartsWithLetter(fix)).isEqualTo(expectedAnimals);
    }

    private Object[] animalGenerator() {
        return new Object[] {
                new Object[]{ new String [] {"kotecek","piesecek","mysz"},new String[] {"kotecek","piesecek"}, new String("cek")},
                new Object[]{ new String [] {"nosek","włosek","kokosek"},new String[] {"kokosek"}, new String("kok")}
        };
    }
}