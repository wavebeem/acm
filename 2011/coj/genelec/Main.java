import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numTests = in.nextInt();
        for (int i=0; i < numTests; i++) {
            int numCandidates = in.nextInt();
            int numRegions    = in.nextInt();

            int[] votes  = new int[numCandidates];

            for (int j=0; j < numCandidates; j++) {
                votes[j] = 0;
            }

            for (int j=0; j < numRegions; j++) {
                for (int k=0; k < numCandidates; k++) {
                    votes[k] += in.nextInt();
                }
            }

            int winIndex = -1;
            int winVotes =  0;

            for (int j=0; j < numCandidates; j++) {
                if (votes[j] > winVotes) {
                    winVotes = votes[j];
                    winIndex = j;
                }
            }

            System.out.println(winIndex + 1);
        }
    }
}
