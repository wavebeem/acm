import java.io.*;
import java.util.*;

class Main {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int groups = s.nextInt();

        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (int i = 0; i < groups; i++) {
            nums.add(Integer.valueOf(s.next()));
        }

        int halfGroups = half(nums.size()); // minimum # of groups
        int sum = 0;
        for (int i = 0; i < halfGroups; i++) {
            Integer n = minimum(nums);
            nums.remove(n);
            sum += half(n); 
        }

        System.out.println(sum);
    }

    private static int half(int n) {
        return n / 2 + 1;
    }

    private static Integer minimum(ArrayList<Integer> ary) {
        int min = 10001;
        for (Integer a : ary) {
            if (a < min) {
                min = a;
            }
        }
        return min;
    }
} 
