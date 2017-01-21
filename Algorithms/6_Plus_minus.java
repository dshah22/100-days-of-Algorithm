/* The first line contains an integer, N, denoting the size of the array. 
The second line contains N space-separated integers describing an array of numbers.
You must print the following  lines:
A decimal representing of the fraction of positive numbers in the array.
A decimal representing of the fraction of negative numbers in the array.
A decimal representing of the fraction of zeroes in the array.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        float plus = 0,minus = 0,zero = 0;
        
        for(int i = 0;i<size;i++) {
          int num = sc.nextInt();
          if(num > 0) plus++;
          else if (num < 0) minus++;
          else zero++;
    }
    System.out.println((float)((float)plus/(float)(size)));
    System.out.println((float)((float)minus/(float)(size)));
    System.out.println((float)((float)zero/(float)(size)));
}
