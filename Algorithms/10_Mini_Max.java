/* Given a single line of five space-separated integers.Each integer is in the inclusive range. 
Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers.
(The output can be greater than 32 bit integer.)
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        long[] arr = {a,b,c,d,e};
        
        Arrays.sort(arr);
        long min = arr[0]+arr[1]+arr[2]+arr[3];
        long max = arr[1]+arr[2]+arr[3]+arr[4];
        System.out.print(min + " "+ max);
    }
}
