import java.util.Scanner;
public class Task28{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the value of s");
        int s = sc.nextInt();
        if(s>=100){
        int l = 1200/(4+(s*s/14900));
        System.out.println(l);
        }
        else{
        int l = 3000-(125*s*s);
        System.out.println(l);
        }
    }
}