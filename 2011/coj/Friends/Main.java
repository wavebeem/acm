/***
description

These days, you can do all sorts of things online. For example, you can use various websites to make virtual friends. For some people, growing their social network (their friends, their friends' friends, their friends' friends' friends, and so on), has become an addictive hobby. Just as some people collect stamps, other people collect virtual friends. Your task is to observe the interactions on such a website and keep track of the size of each person's network. Assume that every friendship is mutual. If Fred is Barney's friend, then Barney is also Fred's friend.

input specification

The first line of input contains one integer specifying the number of test cases to follow (at most 5). Each test case begins with a line containing an integer F, the number of friendships formed, which is no more than 100 000. Each of the following F lines contains the names of two people who have just become friends, separated by a space. A name is a string of 1 to 20 letters (uppercase or lowercase).

output specification

Whenever a friendship is formed, print a line containing one integer, the number of people in the social network of the two people who have just become friends.

sample input

1
3
Fred Barney
Barney Betty
Betty Wilma

sample output

2
3
4
***/

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
