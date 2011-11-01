import java.util.*;

public class Main {
    public static Scanner in;

    public static void doTestCase() {
        int numKids = in.nextInt();

        if (numKids == 0) {
            return;
        }

        int sum = 0;
        for (int n=0; n < numKids; n++) {
            sum += in.nextInt();
        }

        int result = sum % numKids;

        System.out.println(result == 0 ? "YES" : "NO");
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);

        int numTestCases = in.nextInt();

        for (int n=0; n < numTestCases; n++) {
            doTestCase();
        }
    }
}
