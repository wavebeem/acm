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
