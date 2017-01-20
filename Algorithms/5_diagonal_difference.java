import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[][] matrix = new int[size][size];
        
        long d1 = 0;  //diagonal 1
        long d2 = 0;  //diagonal 2
        for(int i = 0; i < size; i++){
          for(int j = 0; j < size; j++) {
            matrix[i][j] = s.nextInt();
            if(i == j) d1 += matrix[i][j];
            if(i == n-j-1) d2 += matrix[i][j];
          }
        }
        
        System.out.println(abs(d1-d2));
    }
}
