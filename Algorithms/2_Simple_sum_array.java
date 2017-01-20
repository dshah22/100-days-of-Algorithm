/* The first line contains an integer, , denoting the size of the array. The second line contains  space-separated integers representing the array's elements.
Print the sum of the array's elements as a single integer.
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int sum = 0;
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            sum += s.nextInt();
        }
        System.out.println(sum);
    }
}
