/***
description

Daniela is a nurse in a large hospital, which causes her working shifts to
constantly change. To make it worse, she has deep sleep, and a difficult time
to wake up using alarm clocks. Recently she got a digital clock as a gift,
with several different options of alarm sounds, and she has hope that it might
help solve her problem. But, lately, she has been very tired and want to enjoy
every single moment of rest. So she carries her new clock to every place she
goes, and whenever she has some spare time, she tries to sleep, setting her
alarm clock to the time when she needs to wake up. But, with so much anxiety
to sleep, she ends up with some difficulty to fall asleep and enjoy some rest.
A problem that has been tormenting her is to know how many minutes of sleep
she would have if she felt asleep immediately and woken up when the alarm
clock ringed. But she is not very good with numbers, and asked you for help to
write a program that, given the current time and the alarm time, find out the
number of minutes she could sleep.
input specification

The input contains several test cases. Each test case is described in one
line, containing four integers H1, M1, H2 and M2, with H1:M1 representing the
current hour and minute, and H2:M2 representing the time (hour and minute)
when the alarm clock is set to ring (0 <= H1 <= 23, 0 <= M1 <= 59, 0 <= H2 <=
23, 0 <= M2 <= 59). The end of the input is indicated by a line containing
only four zeros, separated by blank spaces.
output specification

For each test case, your program must print one line, containing a single
integer, indicating the number of minutes Daniela has to sleep.

sample input

1 5 3 5
23 59 0 34
21 33 21 10
0 0 0 0

sample output

120
35
1417
***/

import java.io.*;
import java.util.*;

class Main {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);

        int h1 = s.nextInt();
        int m1 = s.nextInt();
        int h2 = s.nextInt();
        int m2 = s.nextInt();

        ArrayList<Integer> results = new ArrayList<Integer>();

        while (h1 != 0 ||  m1 != 0 || h2 != 0 || m2 != 0) {
            if (h1 == 0) h1 = 24;
            if (h2 == 0) h2 = 24;

            int begin = h1 * 60 + m1;
            int end   = h2 * 60 + m2;

            if (end > begin) results.add(end - begin);
            else results.add((60*24) - (begin - end));

            h1 = s.nextInt();
            m1 = s.nextInt();
            h2 = s.nextInt();
            m2 = s.nextInt();
        }

        for (Integer r : results) {
            System.out.println(r);
        }
    }
}
