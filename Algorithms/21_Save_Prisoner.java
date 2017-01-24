/* https://www.hackerrank.com/challenges/save-the-prisoner */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        
        for(int i = 0; i< tests;i++) {
            int numPrisoners = in.nextInt();
            int numSweets = in.nextInt();
            int numStart = in.nextInt();
            
            long poisoned = (numStart + numSweets - 1) % numPrisoners;
            if(poisoned == 0)
	           poisoned = numPrisoners;
            System.out.println(poisoned);
        } 
    }
}
