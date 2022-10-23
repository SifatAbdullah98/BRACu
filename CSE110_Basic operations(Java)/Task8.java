import java.util.Scanner;
public class Task8{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num1 = sc.nextInt();
    System.out.println("Enter another number");
    int num2 = sc.nextInt();
    if(num1>num2){
        System.out.println("First is greater");
    }
    else{
        if(num1==num2){
         System.out.println("The numbers are equal");
    }
        else{
           System.out.println("2nd is greater"); 
        }
    }
    }
}