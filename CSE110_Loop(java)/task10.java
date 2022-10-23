import java.util.Scanner;
public class task10{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of your favourite car");
        String name = sc.nextLine();
        System.out.println("Give a number");
        int n = sc.nextInt();
        int x=1;
        while(x<=n){
        System.out.println(name);
        x++;
        }
    }
}