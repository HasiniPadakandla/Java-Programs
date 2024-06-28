import java.util.Scanner;
public class SelectionSort {
    public static void selectionsort(int[] a) {
        int n = a.length;
        int i, j;
        for (i = 0; i < n - 1; i++) {

            if (i % 2 != 0) {
                int min = i;
                for (j = i + 1; j < n; j++) {
                    if (a[min] > a[j]) {
                        min = j;
                    }
                }
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            } else {
                int max = i;
                for (j = i + 1; j < n; j++) {
                    if (a[max] < a[j]) {
                        max = j;
                    }
                }
                int temp = a[max];
                a[max] = a[i];
                a[i] = temp;
            }
        }
    }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            selectionsort(a);
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }