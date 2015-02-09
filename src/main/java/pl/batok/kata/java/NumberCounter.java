package pl.batok.kata.java;

/**
 * Created by mateusz on 09.02.15.
 */
public class NumberCounter {

    int maxNumber;

    public NumberCounter(int max) {
        this.maxNumber = max;
    }

    public int count() {
        int ret =1;
        for(int i=0;i<maxNumber;i++) {
            ret+=i;
        }
        return ret;
    }
}
