
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);

        list.add(s.nextInt());
        while (list.get(0) != 0) {
            list.add(s.nextInt());
            list.add(s.nextInt());
            Collections.sort(list);
            if (Math.pow(list.get(0), 2) + Math.pow(list.get(1), 2) == Math.pow(list.get(2), 2)) {
                System.out.println("right");
            }
            else {
                System.out.println("wrong");
            }

            list = new ArrayList<Integer>();
            list.add(s.nextInt());
        }
    }

}
