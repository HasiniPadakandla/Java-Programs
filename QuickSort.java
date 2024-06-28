public class QuickSort {
    public static int partition(int res[],int low,int high){
        int pivot = res[low];
        int i=low;
        int j=high;
        while (i<j) {
            while (i<high && res[i]<=pivot){
                i++;
            }
            while(res[j]>pivot){
                j--;
            }
            if(i<j){
                int temp=res[i];
                res[i]=res[j];
                res[j]=temp;
            }
        }
        int temp=res[low];
        res[low]=res[j];
        res[j]=temp;
        return j;
    }
    public static void Quicksort(int[] res,int low,int high){
        if(low<high){
            int pidx = partition(res,low,high);
            Quicksort(res,low,pidx-1);
            Quicksort(res,pidx+1,high);
        }
    }
    public static void main(String[] args) {
        int[] a={72,45,67,89,12,90,15,38};
        Quicksort(a,0,a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
