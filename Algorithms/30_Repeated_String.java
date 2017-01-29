/* https://www.hackerrank.com/challenges/repeated-string */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();

        long a = 0;
        if(s.length()==1 && s.charAt(0)=='a'){
            System.out.println(n);
            return;
        }else if (s.length()==1 && s.charAt(0)!='a'){
            System.out.println(0);
            return;
        }
        int countA = 0;
        for(int i =0; i < s.length(); i++){
            if(s.charAt(i)=='a'){
                countA++;
            }
        }
        a = countA * (n/s.length());
        long rem = n % (s.length());
        for(int i = 0; i<rem; i++){
            if(i < s.length() && s.charAt(i)=='a')
                a++;
        }
        System.out.println(a);

    }
}
