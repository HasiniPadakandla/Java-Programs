import java.util.Scanner;
public class Leader {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int flag=0;
            for(int j=i+1;j<n;j++){
                if(a[j]>a[i]) {
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.print(a[i]+" ");
            }
        }
    }
}
