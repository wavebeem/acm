/***
description

The concept of calendar dates back to primitive peoples, when their structure was based solely on th rising and setting of the sun, the moon phases, seasons or other cycles of nature. But the word "calendar" is the later, of latin origin, and designated the first day of each Roman month or Kalendas, formed by a set of rules to the division of time into regular periods and fix the date of occurrence of an event in relation to a particular source. Currently, most countries use the Solar Calendar. The solar year or tropical year is the time it takes Earth to make two steps, by either of the equinoxes, is also the reference time of the Solar Calendar. All the difficulties of the Solar Calendar are that the duration of the tropical year is not an exact number of days, it is equal to 365.24219879 days with a decrease of about half a second per century. For this reason, the scientists inserted leap years in the solar calendar, to solve this problem. A year is a leap year, if it is divisible by 4 and not 100, or if it is divisible by 400. The Solar Calendar is divided into months, these in weeks, and the latter in days. Every week has 7 days (Monday, Tuesday, Wednesday, Thursday, Friday, Saturday and Sunday). There are pairs of days, irrespective of the year in question, that always occur on the same day of week: 7/1 and 21/1 for example. Those different pairs of days that also can be expressed in any of the following forms, are called "Doomsday": 1 - D1/M1 and D2/M2: where 1 <= D1,D2 <= 31, 1 <= M1,M2 <= 12, D1 = M1, D2 = M2 ... 2 - D1/M1 and D2/M2: where 1 <= D1,D2 <= 31, 1 <= M1,M2 <= 12, D1 = M2, D2 = M1 ...

input specification

A series of pairs of days as follows D1 M1 D2 M2, consisting of four integers per line, separated by a space. The entry ends with four zeros.

output specification

It prints "S" on a line if the pairs of days read is an example of Doomsday, otherwise print "N".

sample input

7 1 14 1
6 6 8 8
3 6 6 3
4 4 6 6
0 0 0 0

sample output

N
S
N
S
***/

package doomsday;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);


        Calendar date = new GregorianCalendar();
        int day1,day2,firstNum;
        int d1, d2, m1, m2;
        while(true){
            d1 = inp.nextInt();
            m1 = inp.nextInt();
            d2 = inp.nextInt();
            m2 = inp.nextInt();
            if(d1==0 && m1==0 && d2==0 && m2==0){
                System.exit(0);
            }

            date.set(2011, m1-1, d1);
            day1=date.get(date.DAY_OF_WEEK);
            date.clear();
            date.set(2011, m2-1, d2);
            day2=date.get(date.DAY_OF_WEEK);
            date.clear();
            if((day1 == day2)&&(((d1==m1)&&(d2==m2))||((d1==m2)&&(d2==m1)))){
                date.set(2012, m1-1, d1);
                day1=date.get(date.DAY_OF_WEEK);
                date.clear();
                date.set(2012, m2-1, d2);
                day2=date.get(date.DAY_OF_WEEK);
                date.clear();
                if(day1 == day2){
                    System.out.println("S");
                } else {
                    System.out.println("N");
                }
            } else {
                System.out.println("N");
            }
        }


    }

}
