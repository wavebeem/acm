import java.io.*;
import java.util.*;

class Main {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);

        int h1 = s.nextInt();
        int m1 = s.nextInt();
        int h2 = s.nextInt();
        int m2 = s.nextInt();

        ArrayList<Integer> results = new ArrayList<Integer>();

        while (h1 != 0 ||  m1 != 0 || h2 != 0 || m2 != 0) {
            if (h1 == 0) h1 = 24;
            if (h2 == 0) h2 = 24;

            int begin = h1 * 60 + m1;
            int end   = h2 * 60 + m2;

            if (end > begin) results.add(end - begin);
            else results.add((60*24) - (begin - end));

            h1 = s.nextInt();
            m1 = s.nextInt();
            h2 = s.nextInt();
            m2 = s.nextInt();
        }

        for (Integer r : results) {
            System.out.println(r);
        }
    }
}
