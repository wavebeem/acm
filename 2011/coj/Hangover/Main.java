import java.io.*;
import java.util.*;

class Main {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> answers = new ArrayList<Integer>();

        double n = s.nextDouble(), sum = 0.0;
        int cur = 2, totalCards = 0;

        ArrayList<Double> ns = new ArrayList<Double>();

        while (n != 0.00) {
            ns.add(n);
            n = s.nextDouble();
        }

        for (Double num : ns) {
            while (sum < num) {
                sum += 1.0/cur;
                totalCards++;
                cur++;

            }
            System.out.println(totalCards + " card(s)");
            cur = 2;
            totalCards = 0;
            sum = 0.0;
        }

    }
}
