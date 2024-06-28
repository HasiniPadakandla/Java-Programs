import java.util.Scanner;
public class BubbleSort {
    public static void bubblesort(int []a){
        int n=a.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag=false;
            for (int j = 1; j < n; j++) {
                if (a[j - 1] > a[j]) {
                    flag=true;
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
            if(flag==false){
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        bubblesort(a);
        for (int k= 0; k < n; k++) {
            System.out.print(a[k] + " ");
        }
    }
}