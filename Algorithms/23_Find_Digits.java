/* https://www.hackerrank.com/challenges/find-digits */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int temp = in.nextInt();

        while (in.hasNext()) {
            int count = 0;
            int d2 = in.nextInt();
            char[] k = String.valueOf(d2).toCharArray();
            for (char c : k) {
                int i = Integer.parseInt(Character.toString(c));
                if (i != 0 && d2 % i == 0) {
                    count++;
                }
            }
        System.out.println(count);            
        }              
    }
}
