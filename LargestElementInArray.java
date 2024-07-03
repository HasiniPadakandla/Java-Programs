import java.util.Scanner;
public class LargestElementInArray {
    //largest element in an array
    public static int Largeelement(int[] a, int n) {
        int largest = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }
        return largest;
    }
    //smallest element in an array
    public static int Smallelement(int[] a, int n) {
        int smallest = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] < smallest) {
                smallest = a[i];
            }
        }
        return smallest;
    }
    //second largest element in an array
    public static int Secondlarge(int[]a ,int n){
        int largest=a[0];
        int slargest=-1;
        for(int i=1;i<n;i++){
            if(a[i]>largest)
            {
                slargest=largest;
                largest=a[i];
            }
            else if (a[i]<largest && a[i]>slargest)
            {
                slargest= a[i];
            }
        }
        return slargest;
    }
    //second smallest element in an array
    public static int secondsmall(int[]a ,int n){
        int smallest=a[0];
        int ssmallest= 100000;
        for(int i=1;i<n;i++){
            if(a[i]<smallest){
                ssmallest=smallest;
                smallest=a[i];
            } else if (a[i]!=smallest && a[i]<ssmallest) {
                ssmallest=a[i];
            }
        }
        return ssmallest;
    }
    //printing elements
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(Largeelement(a,n));
        System.out.println(Secondlarge(a,n));
        System.out.println(Smallelement(a,n));
        System.out.println(secondsmall(a,n));
    }
}
