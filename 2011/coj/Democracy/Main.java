
package democracy;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int numGroups = inp.nextInt();

        ArrayList<Integer> groups = new ArrayList();
        for (int i=0; i<numGroups; i++) {
            groups.add(inp.nextInt());
        }

        Collections.sort(groups);
        Integer total = 0;
        for (int i=0; i<(groups.size()/2)+1; i++)
            total += (groups.get(i)/2)+1;

        System.out.println(total);
    }

}
