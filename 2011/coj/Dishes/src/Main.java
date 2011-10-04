
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int times = inp.nextInt();
        
        int weight;
        boolean first;
        for (int i=0; i<times; i++) {
            weight = inp.nextInt();
            first = true;
            for (int j=0; j<15; j++) {
                if ((weight & 1) == 1) {
                       if (!first)
                           System.out.print(" ");
                       else
                           first = !first;
                       System.out.print(j);
                }

                weight >>= 1;
            }
            System.out.println();
        }
    }

}
