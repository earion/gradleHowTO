package pl.batok.kata.java;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.stream.Collectors.toList;

/**
 * Created by mateusz on 09.02.15.
 */
public class AnimalsCounter {

    private ArrayList<String> animalsList;

    public AnimalsCounter(String[] animals) {
        this.animalsList =  new ArrayList<>(Arrays.asList(animals));
    }

    public Object[] countAnimalsStartsWithLetter(String contain) {
        return animalsList.stream().filter(animal -> animal.contains(contain)).collect(toList()).toArray();
    }
}
