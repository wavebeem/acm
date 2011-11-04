/***
description

Transform the algebraic expression with brackets into RPN form (Reverse Polish Notation). Two-argument operators: +, -, *, /, ^ (priority from the lowest to the highest), brackets ( ). Operands: only letters: a,b,...,z. Note that the resulting expression must be evaluated from right to left, that is, a+b+c must be evaluated as c+b+a, but respecting the priorities of operators.

input specification

t [the number of expressions <= 100] expression [length <= 400] [other expressions] Text grouped in [ ] does not appear in the input file.

output specification

The expressions in RPN form, one per line, ready to be evaluated from right to left.

sample input

3
(a+b*c)
((a+b)*(z+x))
((a+t)*((b+a+c)^(c+d)))

sample output

abc*+
ab+zx+*
at+bac++cd+^*
***/

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