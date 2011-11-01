import java.util.*;

public class Main {
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // aka totient function
    public static int eulerPhi(int n) {
        int count = 0;

        for (int i=0; i < n; i++) {
            count += gcd(i, n) == 1 ? 1 : 0;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(eulerPhi(n));
    }
}
