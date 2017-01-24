/* https://www.hackerrank.com/challenges/beautiful-days-at-the-movies */


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        int k = in.nextInt();
        int count = 0;
        
        for (int i=start; i<end; i++){
            StringBuilder temp = new StringBuilder();
            temp.append(i);
            temp=temp.reverse();
            int rev = Integer.parseInt(temp.toString());
            if(Math.abs((i-rev)%k)==0){
                count++;
            }
        }
        
        System.out.println(count);
    }
    
}
