import java.util.Scanner;
public class Task25{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you the president?");
        String ans = sc.nextLine();
        if(ans =="yes"){
        System.out.println("No tax");
        }
        else{
        System.out.println("Give your age");
        int age = sc.nextInt();
        if(age<18){
         System.out.println("No tax");
        }
         else{
         System.out.println("Give your paid ammount");
         int a = sc.nextInt();
         if(a<10000){
         
         }
         else{
             if(a<=20000){
             double tax = (a*0.05);
             System.out.println(tax);
             }
             else{
             double tax = (a*0.1);
             System.out.println(tax);
             }
         }
         }
        }
        }
    }

     