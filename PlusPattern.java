import java.util.Scanner;
public class PlusPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int middle = n / 2 + 1;
        for (int i = 1; i <= n; i++) {
            if (i == middle) {
                    for (int j = 1; j <= n; j++) {
                    System.out.print(j + "    "); 
                }
                System.out.println();
            } 
           else { 
                for (int j = 1; j <= n; j++) {
                    if (j == middle) {
                        System.out.print(i); 
                    } 
                   else {
                        System.out.print("     "); 
                    }
                }
                System.out.println();
            }
        }
  }
}
