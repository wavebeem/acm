/***
description

Bamboo is a species of plant that grows vertically from the ground. Despite its incredible strength, and which reaches several meters in height, the strong northerly wind eventually overcomes its trunk. A group of young scientists study some properties of this plant, and will need to develop a software to determine the average distance from ground which breaks the bamboo stem.

input specification

The first line contains the number of cases to process (1 <= T <= 50). Each case consists of a line containing a number H (0 < H <= 50) which represents the initial height of the plant in question before breaking, and a number D, the distance between the base of the trunk of the plant and the point where it is supported the top of the plant after break and fall down.

output specification

For every plant should be printed on one line, the value of the height at which it breaks. In the T+1 line, should be printed the average distance from ground which breaks the bamboo stem of the processed plants. All the calculated values to be written with one decimal place of accuracy.

sample input

3
50.0 20.5
18.0 6.0
32.0 10.2
sample output

20.8
8.0
14.4
14.4
***/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int    times = in.nextInt();
        double sum   = 0.0;

        for (int i=0; i < times; i++) {
            double H = in.nextDouble();
            double D = in.nextDouble();

            double a = ((D*D) - (H*H))/(-2*H);

            System.out.printf("%.1f\n", a);

            sum += a;
        }

        System.out.printf("%.1f\n", sum / times);
    }
}
