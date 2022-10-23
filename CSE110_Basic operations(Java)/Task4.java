import java.util.Scanner;
public class Task4{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num1 = sc.nextInt();
    System.out.println("Enter another number");
    int num2 = sc.nextInt();
    int sum=num1+num2;
    int diffrence=num1-num2;
    int product= num1*num2;
    System.out.println(sum);
    System.out.println(diffrence);
    System.out.println(product);
    }
}