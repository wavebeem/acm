package substring;

import java.util.Scanner;

/**
 * @author Fwirt
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String ans = scan.next();
            String sub = new String(ans);
            String str = scan.next();
            String temp = "";
            for (int i=0;i<str.length();i++) {
                if (!sub.isEmpty())
                    if (str.charAt(i) == sub.charAt(0)) {
                        temp = temp + sub.charAt(0);
                        sub = sub.substring(1);            
                    }
            }
            if (temp.equals(ans))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
