/* https://www.hackerrank.com/challenges/jumping-on-the-clouds */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }

        int i = 0;
        int count = 0;
        while(i < n-1) {
            if (i+2 < n && c[i+2] != 1) {
                i += 2;
            } else {
                i++;
            }
            count++;
        }

        System.out.println(count);
    }
}
