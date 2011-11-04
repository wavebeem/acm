/***
description

It is known that pythagorean triplets are those two numbers together their squares equals the third number squared.

input specification

The input will consist of lines with three integers such that all are less than 10000. The input ends with a line consisting of a single value, the number 0.

output specification

The output will be a line for each line of input, with a single word: 'right' or 'wrong' depending on whether the three numbers given form a pythagorean triplets.

sample input

3 4 5
6 10 8
2 3 4
0

sample output

right
right
wrong
***/

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
