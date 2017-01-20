/* The first line of the input consists of an integer . The next line contains  space-separated integers contained in the array.
Print a single value equal to the sum of the elements in the array, keeping in mind some of these numbers maybe quite large.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        long sum = 0;
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            sum += s.nextInt();
        }
        System.out.println(sum);
    }
}
