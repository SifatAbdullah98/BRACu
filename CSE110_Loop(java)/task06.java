import java.util.Scanner;
public class task06{
    public static void main(String[]args){
        int x=1,sum=0;
        while(x<=20){
            Scanner sc= new Scanner(System.in);
            System.out.println("give numbers");
            int a= sc.nextInt();
            sum=sum+a;
            x++;
        }
        double average = sum/20;
         System.out.println(average);
    }
}