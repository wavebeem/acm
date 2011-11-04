/***
description

For given integer N (1 <= N <= 10^4) find the amount of positive numbers not greater than N that coprime with N. Let us call two positive integers (say, A and B, for example) coprime if (and only if) their greatest common divisor is 1. (i.e. A and B are coprime if gcd(A,B) = 1).

input specification

Input contains integer N.

output specification

Write answer in standard output.

sample input

9

sample output

6
***/
import java.util.*;

public class Main {
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // aka totient function
    public static int eulerPhi(int n) {
        int count = 0;

        for (int i=0; i < n; i++) {
            count += gcd(i, n) ? 1 : 0;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(eulerPhi(n));
    }
}
