import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int    times = in.nextInt();
        double sum   = 0.0;

        for (int i=0; i < times; i++) {
            double H = in.nextDouble();
            double D = in.nextDouble();

            double a = ((D*D) - (H*H))/(-2*H);

            System.out.printf("%.1f\n", a);

            sum += a;
        }

        System.out.printf("%.1f\n", sum / times);
    }
}
