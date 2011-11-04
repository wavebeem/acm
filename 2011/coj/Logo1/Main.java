/***
description

Logo is a programming language built around a turtle. Commands in the language cause the turtle to move. The turtle has a pen attached to it. As the turtle moves, it draw lines on the page. The turtle can be programmed to draw interesting pictures. We are interested in making the turtle draw a picture, then return to the point that it started from. For example, we could give the turtle the following program: fd 100 lt 120 fd 100 lt 120 fd 100 The command fd causes the turtle to move forward by the specified number of units. The command lt causes the turtle to turn left by the specified number of degrees. Thus the above commands cause the turtle to draw an equilateral triangle with sides 100 units long. Notice that after executing the commands, the turtle ends up in the same place as it started. The turtle understands two additional commands. The command bk causes the turtle to move backward by the specified number of units. The command rt causes the turtle to turn right by the specified number of degrees. After executing many commands, the turtle can get lost, far away from its starting position. Your task is to determine the straight-line distance from the turtle's position at the end of its journey back to the position that it started from.

input specification

The first line of input contains one integer specifying the number of test cases to follow (at most 60). Each test case starts with a line containing one integer, the number of commands to follow. The commands follow, one on each line. Each test case will contain no more than 1000 commands.

output specification

For each test case, output a line containing a single integer, the distance rounded to the nearest unit.

sample input

1
5
fd 100
lt 120
fd 100
lt 120
fd 100

sample output

0
***/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int testNum, numLines;
        double deltaX, deltaY;
        int deltaTheta, deltaP, totalDistance;
        String tempCmd;
        Scanner scanner = new Scanner(System.in);

        testNum = scanner.nextInt();
        for(int test = 0; test < testNum; test++){
            numLines = scanner.nextInt();
            deltaX = deltaY = 0.0;
            deltaTheta = deltaP = totalDistance = 0;
            for(int line = 0; line < numLines; line++){
                tempCmd = scanner.next();
                if(tempCmd.equals("fd")){
                    deltaP += scanner.nextInt();
                } else if (tempCmd.equals("bk")) {
                    deltaP -= scanner.nextInt();
                } else if (tempCmd.equals("lt")) {
                    if(deltaP != 0){
                        //calc
                        deltaX += Math.cos(Math.toRadians(deltaTheta))*deltaP;
                        deltaY += Math.sin(Math.toRadians(deltaTheta))*deltaP;
                        //System.out.println("DeltaX: "+deltaX+"DeltaY:"+deltaY);
                        deltaP = 0;
                    }
                    deltaTheta += scanner.nextInt();
                } else if (tempCmd.equals("rt")) {
                    if(deltaP != 0){
                        //calc
                        deltaX += Math.cos(Math.toRadians(deltaTheta))*deltaP;
                        deltaY += Math.sin(Math.toRadians(deltaTheta))*deltaP;
                        //System.out.println("DeltaX: "+deltaX+"DeltaY:"+deltaY);
                        deltaP = 0;
                    }
                    deltaTheta -= scanner.nextInt();
                } else {
                    System.out.print("Turtle doesn't understand.");
                    System.exit(0);
                }
            }
            //calc
            if(deltaP != 0){
                deltaX += Math.cos(Math.toRadians(deltaTheta))*deltaP;
                deltaY += Math.sin(Math.toRadians(deltaTheta))*deltaP;
            }
            //calculate hypotenuse
            //System.out.println("DeltaX: "+deltaX+"DeltaY:"+deltaY);
            System.out.println(Math.round(Math.sqrt(Math.pow(deltaX,2)+Math.pow(deltaY, 2))));
        }
    }
}
