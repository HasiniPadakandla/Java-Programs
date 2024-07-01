import java.util.Scanner;
public class BinarySearch {
    public static int bin(int []a,int key){
        int low=0;
        int high=a.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(a[mid]==key) return mid;
            else if (a[mid]>key){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return -1;
    }

    public static int binrec(int []a,int key,int low,int high){
        int n=a.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==key) return mid;
            else if (a[mid]>key) {
                return binrec(a,key,low,mid-1);
            }
            else{
                return binrec(a,key,mid+1,high);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int key=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        int p = binrec(a,key,0,n-1);
        System.out.println(p);
    }
}
