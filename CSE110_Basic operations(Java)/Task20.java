import java.util.Scanner;
public class Task20{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give your mark");
        int mark = sc.nextInt();
        if(mark>50){
            System.out.println("pass");
        }
            else{
            System.out.println("you shall not pass");
    }
    }
}