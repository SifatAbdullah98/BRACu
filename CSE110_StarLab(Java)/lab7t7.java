import java.util.Scanner;
public class lab7t7{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("give row number");
        int row = sc.nextInt(),i,j,k;
        for(i=1;i<=row;i++){
            for(j=1;j<=row-i;j++){
            System.out.print(" ");
            }
            for(k=1;k<=i;k++){
            System.out.print("*");
            }
            System.out.println();
        }  
    }
}
       
 
