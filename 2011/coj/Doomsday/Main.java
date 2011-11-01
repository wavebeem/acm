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
