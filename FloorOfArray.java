import java.util.Arrays;
import java.util.Scanner;
public class FloorOfArray {
    public static int floor(int []a,int key){
        int i=0;
        int n=a.length;
        Arrays.sort(a);
        for(i=0;i<n;i++){
            if(a[i]==key) return a[i];
            else if (a[i]>key) {
                if(i==0)
                    return -1;
                else
                    return a[i-1];
            }
        }
        return a[i-1];
    }

    public static int flooroptimal(int []a,int key){
        int i=0;
        Arrays.sort(a);
        int n=a.length;
        if(a[0]>key){
            return -1;
        }
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==key)
                return a[mid];
            else if (a[mid]>key) {
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return a[high];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        int p=flooroptimal(a,key);
        System.out.println(p);
    }
}
