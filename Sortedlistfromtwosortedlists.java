import java.util.Scanner;

public class Sortedlistfromtwosortedlists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2=sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        int[] c = new int[n1+n2];
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < n2; j++) {
            b[j] = sc.nextInt();
        }
        int i=0;
        int j=0;
        int k=0;
        while(i<n1 && j<n2){
            if (a[i] < b[j]){
                c[k] = a[i];
                i++;
            }
            else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            c[k]=a[i];
            k++;
            i++;
        }
        while(j<n2){
            c[k]=b[j];
            j++;
            k++;
        }
        for(k=0;k<n1+n2;k++){
            System.out.print(c[k]+" ");
        }
    }
}