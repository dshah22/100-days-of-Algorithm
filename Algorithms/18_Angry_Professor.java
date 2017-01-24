/* https://www.hackerrank.com/challenges/angry-professor */


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        
        for(int i = 0; i< tests;i++) {
            int n = in.nextInt();
            int k = in.nextInt();
            int onTime = 0;
            for(int j = 0; j<n;j++) {
                int temp = in.nextInt();
                if(temp<=0) onTime++;
            }
            if(onTime < k) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
