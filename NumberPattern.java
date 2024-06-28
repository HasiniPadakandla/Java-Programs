import java.util.Scanner;
public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count = 1,i,j;
        int n=sc.nextInt();
        for (i = 0; i < n; i++) {           
            for (j = 0; j < n; j++) {       
                System.out.printf("%02d ", count);  
                count++;
            }
            System.out.println();               
        }
    }
}
