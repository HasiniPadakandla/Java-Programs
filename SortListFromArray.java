import java.util.Scanner;
public class SortListFromArray {
    public static void mergesort(int[] res,int low,int high){
        int mid=(low+high)/2;
        int n1=mid-low+1;
        int n2=high-mid;
        int a[] =new int[n1];
        int b[] =new int[n2];
        int i=0;
        int k=low;
        while(i<n1){
            a[i]=res[k];
            i++;
            k++;
        }
        int j=0;
        while(j<n2){
            b[j]=res[k];
            j++;
            k++;
        }
        i=0;
        j=0;
        k=low;
        while(i<n1 && j<n2){
            if (a[i] < b[j]){
                res[k] = a[i];
                i++;
            }
            else {
                res[k] = b[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            res[k]=a[i];
            k++;
            i++;
        }
        while(j<n2){
            res[k]=b[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a=new int[n1];
        for(int i=0;i<n1;i++){
            a[i]=sc.nextInt();
        }
        mergesort(a,2,n1-1);
        for(int i=0;i<n1;i++){
            System.out.print(a[i]+" ");
        }
    }
}
