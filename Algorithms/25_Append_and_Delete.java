/* https://www.hackerrank.com/challenges/append-and-delete */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        if (k >= s.length() + t.length()) { 
            System.out.println("Yes"); 
            return;
        }
        
        String answer = "No";
        int minLength = Math.min(s.length(), t.length());
        int subLength = 0;
        while(subLength < minLength && s.charAt(subLength) == t.charAt(subLength))
            subLength++;
        
        int minReplace = (s.length() - subLength) + (t.length() - subLength);
        if (k >= minReplace && (k - minReplace) % 2 == 0)
            answer = "Yes";

        System.out.println(answer);
    }
}

