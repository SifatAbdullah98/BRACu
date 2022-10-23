import java.util.Scanner;
public class Task32{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the value of q");
        int q = sc.nextInt();
        if(q<=50){
        int p = 6000+(15*q*q);
        System.out.println(p);
        }
        else{
        int l = 1000/(3+(q*q/1900));
        System.out.println(q);
        }
    }
}