import java.util.Scanner;
public class lab7t13{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("give row number");
        int row = sc.nextInt(),i,j,k;
        for(i=1;i<=row;i++){
            for(j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++){
            System.out.print(k);
            }
            System.out.println();
        }
        row--;
        for(i=row;i>=1;i--){
            for(j=row-i;j>=0;j--){
                System.out.print(" ");
            }
            for(k=2*i-1;k>=1;k--){
            System.out.print(k);
            }
            System.out.println();
    }
    }
}