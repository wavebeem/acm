/***
description

General Election is over, now it is time to count the votes! There are n (2 <= n <= 5) candidates and m (1 <= m <= 100) vote regions. Given the number of votes for each candidate from each region, determine which candidate is the winner (one with the most votes).

input specification

The first line of input contains an integer T, the number of test cases follow. Each test case starts with an integer n and m denoting the number of candidate and number of region. The next m lines each contains n integers, V1, V2, ..., Vn (0 <= Vi <= 1000) the number of votes for candidate i.

output specification

For each test case, output in a line the winning candidate. You may safely assume that the winner is unique.

sample input

2
3 3
159 213 450
512 890 993
215 420 397
2 5
40 64
35 12
102 58
43 15
79 41

sample output

3
1
***/

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
