import java.util.Scanner;
public class lab7t6{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("give line number");
        int ln = sc.nextInt(),x=1;
        while(x<=ln){
            int y=1;
            while(y<=x){
        System.out.print(y);
        y++;
        }
        System.out.println();
        x++;
        }
    }
}