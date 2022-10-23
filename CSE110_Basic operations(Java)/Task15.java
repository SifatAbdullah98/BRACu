import java.util.Scanner;
public class Task15{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st number");
    int i = sc.nextInt();
    if(i%2==0){
        System.out.println(i);
    }
    else{
        if(i%5==0){
        System.out.println(i);  
        }
    }
    }
}