
package bamboo;

import java.util.Scanner;

/**
 *
 * @author Trevor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfArgs = scanner.nextInt();

        double h;
        double d;
        double answer;
        double sum = 0.0;

        for(int i = 0; i < numOfArgs;i++){
            h = scanner.nextDouble();
            d = scanner.nextDouble();

            answer = h-((Math.pow(h, 2)+Math.pow(d, 2))/(2*h));
           
            answer = new Double( Math.round(answer*10))/10;//answer - (answer%1))/10;
            sum += answer;

            System.out.println(answer);
        }
        sum = new Double( Math.round(sum/numOfArgs*10))/10;//answer - (answer%1))/10;

        System.out.println(sum);
    }
}
