/* The first line contains 3 space-separated integers,n,k, and q, respectively. 
The second line contains n space-separated integers, where each integer i describes array element a[i].
Each of the q subsequent lines contains a single integer denoting m. 
For each query, print the value of the element at index m of the rotated array on a new line.
*/


import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int rotation = k%n;
        int[] a = new int[n];
        
        for(int i=0; i < n; i++)
            a[i] = in.nextInt();
        
        for(int i = 0; i < q; i++){
            int m = in.nextInt();
            if(m-rotation >= 0)
                System.out.println(a[m-rotation]);
            else
                System.out.println(a[m-rotation+a.length]);
        }
    }
}
