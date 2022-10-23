import java.util.Scanner;
public class task05{
    public static void main(String[]args){
        int x=1;
        while(x<=20){
            Scanner sc= new Scanner(System.in);
            System.out.println("give numbers");
            int num = sc.nextInt();
            if(num%2==0){
            System.out.println("Even");
            }
            else{
            System.out.println("odd");
            }
            x++;
        }
    }
}
