import java.util.*;

public class Main{
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        while (num != 0) {
            String binNum = Integer.toBinaryString(num);
            int parity = binNum.replace("0", "").length();
            System.out.println("The parity of " + binNum + " is " + parity + " (mod 2).");
            num = s.nextInt();
        }
    }
}
