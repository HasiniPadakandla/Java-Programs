import java.util.Scanner;
public class FloydStarReverse{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
int n = sc.nextInt();
int i,j,k;
for(i=1;i<=n;i++){
for(k=n-1;k>=i;k--){
System.out.print(" ");
}
for(j=1;j<=i;j++){
System.out.print("*  ");
}
System.out.println();
}
}
}