package pl.batok.kata.java;

/**
 * Created by mateusz on 12.01.15.
 */
public class PrintFloydTriangle {

    public static void main(String args[]) {
        int max =16;
        int n =1;
        int m =n;
        int i=1;
        while(true) {
            n = m;
            while (n > 0) {
                System.out.print(i++ + " ");
                n--;
                if (i == max) return;
            }
            System.out.println();
            m++;
        }

    }
}
