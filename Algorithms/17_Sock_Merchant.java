/* https://www.hackerrank.com/challenges/sock-merchant */

import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i < n; i++){
            c[i] = in.nextInt();    
            if(!set.contains(c[i])) {
                set.add(c[i]);
            }
            else {
                count++;
                set.remove(c[i]);
            }
        }
            System.out.println(count);   
    }
}

