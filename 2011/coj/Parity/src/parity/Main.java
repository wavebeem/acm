package parity;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int cur = inp.nextInt();
        int save;
        int tot;
        while (cur != 0) {
            save = cur;
            tot = 0;
            while (cur != 0) {
                if ((cur & 1) == 1) {
                    tot++;
                }
                cur >>= 1;
            }
            System.out.println("The parity of "+Integer.toBinaryString(save)+" is "+tot+" (mod 2).");
            cur = inp.nextInt();
        }
    }

}
