import java.util.Scanner;
public class Subarray {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+a[j];
                if(max<sum){
                    max=sum;
                }
                /*for(int k=i;k<=j;k++){
                    System.out.print(a[k]+" ");
                    sum=sum+a[k];
                }*/
            }
        }
        System.out.print("maxsum="+ max);
    }
}
