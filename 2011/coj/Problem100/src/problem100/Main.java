package problem100;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer i,j,small,large,m,n;
        int count, max;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            i = sc.nextInt();
            if(!sc.hasNextInt()){
                System.exit(0);
            }
            j = sc.nextInt();
            max = 0;
            small = i;
            large = j;
            if(i>j){
                small = j;
                large = i;
            }
            for(m = small; m < large+1; m++) {
                count = 1;
                n = m;
                while(n != 1) {
                    //System.out.print(n + " ");
                    count++;
                    if(n % 2 == 1){
                        n = 3*n+1;
                    } else {
                        n = n/2;
                    }
                }
                if(max < count){
                    max = count;
                }
                //System.out.println(1);
                //System.out.println(m+ ": " +count);
            }
            System.out.println(i + " " + j + " " + max);
        }
        System.exit(0);
    }
}