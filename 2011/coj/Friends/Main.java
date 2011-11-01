
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> groups = new ArrayList<ArrayList<String>>();
        String s1, s2;
        Integer n1, n2;
        Scanner s = new Scanner(System.in);

        Integer numCases = s.nextInt();
        for (int i=0; i<numCases; i++) {
            Integer numTimes = s.nextInt();
            for (int j=0; j<numTimes; j++) {
                s1 = s.next();
                s2 = s.next();
                n1 = n2 = -1;
                for (int k=0; k<groups.size(); k++) {
                    if (groups.get(k).contains(s1)) {
                        n1 = k;
                    }
                    if (groups.get(k).contains(s2)) {
                        n2 = k;
                    }
                }
                if ((n1 > -1) && (n2 > -1)) {
                    if (n1 != n2) {
                        groups.get(n1).addAll(groups.get(n2));
                        groups.remove(n2);
                    }
                    System.out.println(groups.get(n1).size());
                }
                else if (n1 > -1) {
                    groups.get(n1).add(s2);
                    System.out.println(groups.get(n1).size());
                }
                else if (n2 > -1) {
                    groups.get(n2).add(s1);
                    System.out.println(groups.get(n2).size());
                }
                else if ((n1 == -1) && (n2 == -1)) {
                    ArrayList<String> temp = new ArrayList<String>();
                    temp.add(s1);
                    temp.add(s2);
                    groups.add(temp);
                    System.out.println("2");
                }
            }
        }
    }

}
