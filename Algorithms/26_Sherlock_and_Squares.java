/* https://www.hackerrank.com/challenges/sherlock-and-squares */

import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        
        for(int i =0; i<tests;i++) {
            int start  = in.nextInt();
            int end = in.nextInt();
            int count = 0;
            
            if(Math.floor(Math.sqrt(start)) == Math.sqrt(start))
                count++;
            count += Math.round(Math.floor(Math.sqrt(end)) - Math.floor(Math.sqrt(start)));
            System.out.println(count);
        }
    }
}

