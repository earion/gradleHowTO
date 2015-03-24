package pl.batok.kata.java;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by mateusz on 24.03.15.
 */
public class StringCalculator {

    private String regex;

    public int add(String s) throws Exception {
        if(s.length() == 0) return 0;
        else {
            s = findDelimeter(s);

            if(getIntStream(s).anyMatch(num -> num < 0)) {
                String message = getIntStream(s)
                        .filter(num -> num < 0)
                        .mapToObj(x -> String.valueOf(x))
                        .collect(Collectors.joining(","));
                throw new Exception(message);
            }
            return getIntStream(s).sum();
        }
    }

    private IntStream getIntStream(String s) {
        return Arrays.asList(s.split(regex)).stream()
                        .mapToInt(Integer::decode);
    }

    private String findDelimeter(String s) {
        regex = ",|\\n";
        if(s.startsWith("//")){
            String delimiter = String.valueOf(s.charAt(2));
            s = s.substring(4);
            regex = delimiter + "|" + regex;
        }
        return s;
    }
}
