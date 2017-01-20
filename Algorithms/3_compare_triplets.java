/* The first line contains 3 space-separated integers, a0, a1, and, a2 describing the respective values in triplet . 
The second line contains 3 space-separated integers,b0, b1, and, b2 describing the respective values in triplet .
Print two space-separated integers denoting the respective comparison scores of A & B.
*/

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        int a[0] = in.nextInt();
        int a[1] = in.nextInt();
        int a[2] = in.nextInt();
        int b[0] = in.nextInt();
        int b[1] = in.nextInt();
        int b[2] = in.nextInt();
        
    int aPoints = 0; 
    int bPoints = 0;
    for(int i = 0; i < 3; i++) {
        if(a[i] > b[i]) 
            aPoints++;
        else if (b[i] > a[i]) 
            bPoints++;
    }
    
    System.out.println(aPoints + " " + bPoints);

    }    
}
