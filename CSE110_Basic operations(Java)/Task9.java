import java.util.Scanner;
public class Task9{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num1 = sc.nextInt();
    System.out.println("Enter another number");
    int num2 = sc.nextInt();
    if(num1>num2){
        int substract=num1-num2;
        System.out.println(substract);
    }
    else{
        int substract=num2-num1;
        System.out.println(substract);
    }
    }
}
    