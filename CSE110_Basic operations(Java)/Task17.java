import java.util.Scanner;
    public class Task17{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Give an integer");
        int x = sc.nextInt();
        if(x%2==0){
            if(x%5==0){
                System.out.println(x);
            }
        }
    }
    }
            