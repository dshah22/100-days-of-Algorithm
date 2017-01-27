/* https://www.hackerrank.com/challenges/extra-long-factorials */

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        BigInteger bigInt = fibSeries(BigInteger.valueOf(n));
        System.out.print(bigInt);
    }

    private static  BigInteger fibSeries(BigInteger n){
         BigInteger big1 = new BigInteger("1");

        BigInteger fibNumber =big1;
        if(n.intValue() == 0)
            return big1;

        return n.multiply(fibSeries(n.subtract(big1)));

    }
}
