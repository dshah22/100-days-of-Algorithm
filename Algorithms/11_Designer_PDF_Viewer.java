/* https://www.hackerrank.com/challenges/designer-pdf-viewer */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int width = 0;
        int height = 0;
        for(int i = 0; i<word.length();i++){
            if (h[word.charAt(i) - 97] > height)
                height = h[word.charAt(i) - 97];
            width+=1;
        }
        System.out.print(height*width);
    }
}
