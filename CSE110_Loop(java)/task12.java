import java.util.Scanner;
public class task12{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("give the first numbers");
        int a = sc.nextInt();
        int sum=0,n=1,max=a;
        while(n<=6){
        System.out.println("give other numbers");
        int b = sc.nextInt();
        if(b>max){
        max=b;
        }
        sum=sum+b;
        n++;
        }
        int average=(sum+a)/7;
        System.out.println(average);
        System.out.println(max);
    }
}