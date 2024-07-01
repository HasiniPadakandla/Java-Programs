import java.util.Scanner;
public class LinearSearch{

    public static int linear(int []a,int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key) return i;
        }
        return -1;
    }

    public static int linearrec(int []a,int key,int idx){
        int n=a.length;
        if(idx==n){
            return -1;
        }
        if(a[idx]==key){
            return idx;
        } else{
            return linearrec(a,key,idx+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int key=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        int p=linearrec(a,key,0);
        System.out.println(p);
    }
}
