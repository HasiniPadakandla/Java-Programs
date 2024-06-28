import java.util.Scanner;
public class InsertInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int j;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int temp = a[n - 1];
        for(j=n-2;j>=0;j--) {
            if (temp < a[j]) {
                a[j + 1] = a[j];
            }
        }
        a[j + 1] = temp;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
