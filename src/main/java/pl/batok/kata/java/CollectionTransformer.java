package pl.batok.kata.java;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by mateusz on 30.11.14.
 */
public class CollectionTransformer {


    public static List<String> transform7(List<String> inputList) {
        List<String> returnList = new ArrayList<>();
        for(String input : inputList) {
            returnList.add(input.toUpperCase());
        }
        return returnList;
    }


    public static List<String> transform8(List<String> inputList) {
        return inputList.stream().map(String::toUpperCase).collect(toList());
    }

    public static List<Integer> reduce4(List<Integer> inputList) {
        return inputList.stream().filter(value -> value >= 4).collect(toList());
    }

    public static List<String> transformLengthAndSize(List<String> inputList){
        return inputList.stream().filter(value -> value.length() >4).map(String::toUpperCase).collect(toList());
    }





}
