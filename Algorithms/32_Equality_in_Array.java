/* https://www.hackerrank.com/challenges/equality-in-a-array */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       Map<Integer,Integer> map = new HashMap<>();
       int n = in.nextInt();
       for(int i = 0;i<n;i++){
            int num = in.nextInt();
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }
            else{
                map.put(num,1);
            }
        }
        System.out.println(n-Collections.max(map.values()));
    }
}
