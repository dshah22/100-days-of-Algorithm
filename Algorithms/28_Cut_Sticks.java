/* https://www.hackerrank.com/challenges/cut-the-sticks */

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
    Arrays.sort(a);

   for(int j=0;j<n;j++){
       int small=a[j];
       int l=j;
       int count=0;
       while(l<n){
           if(a[l]>=small && small!=0){
           a[l]=a[l]-small;
           count++;
       }
       l++;}
      if(count!=0)
       System.out.println(count);
   }
}

