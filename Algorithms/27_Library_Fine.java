/* https://www.hackerrank.com/challenges/library-fine */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int dr = in.nextInt();
        int mr = in.nextInt();
        int yr = in.nextInt();
        int de = in.nextInt();
        int me = in.nextInt();
        int ye = in.nextInt();
        int fine = 0;
        if(yr>ye)
            fine=10000;
        else if(mr>me && yr>=ye)
            fine=500*(mr-me);
        else if(dr>de && mr>=me && yr>=ye)
            fine=15*(dr-de);
        System.out.print(fine);
    }
}
