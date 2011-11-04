/***
description

You have devised a new encryption technique which encodes a message by inserting between its characters randomly generated strings in a clever way. Because of pending patent issues we will not discuss in detail how the strings are generated and inserted into the original message. To validate your method, however, it is necessary to write a program that checks if the message is really encoded in the final string. Given two strings s and t, you have to decide whether s is a subsequence of t; i.e. if you can remove characters from t such that the concatenation of the remaining characters is s.

input specification

The input contains several test cases. Each is specified by two strings s,t of alphanumeric ASCII characters separated by white-space. Input is terminated by EOF.
output specification

For each test case output, if s is a subsequence of t.

sample input

sequence subsequence
person compression
VERDI vivaVittorioEmanueleReDiItalia
caseDoesMatter CaseDoesMatter

sample output

Yes
No
Yes
No
***/

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
