/*  https://www.hackerrank.com/challenges/bon-appetit */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i] = in.nextInt();
        
        int bill = in.nextInt();
        int sum = 0;
        for(int i=0; i<n;i++) {
            if(i!=k)
                sum = sum + a[i];
        }
        int share = sum/2;
        if(share == bill)
            System.out.println("Bon Appetit");
        else
            System.out.println(bill - share);
    }

}
