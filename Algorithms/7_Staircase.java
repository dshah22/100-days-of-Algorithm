/* Print staircase taking the height as the user input
   #
  ##
 ###
####

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        
        for(int i =0; i< height;i++) {
            for(int j = 0; j< height-i-1;j++) {
                System.out.print(" ");
            }
            for(int j = height-i-1;j<height;j++)
                System.out.print("#");
            System.out.println();
        }
    }
}
