/* https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited*/


public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int c[] = new int[n];
    for(int c_i=0; c_i < n; c_i++){
        c[c_i] = in.nextInt();
    }
    int num = n/k;
    int e = 100;
    for(int i=0; i<num; i++){
        if(c[i*k] == 1){
            e = e - 3;
        }
        else 
            e = e -1;
    }
    System.out.println(e);
}
