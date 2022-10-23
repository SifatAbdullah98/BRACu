import java.util.Scanner;
public class lab7t3{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("give col number");
        int col = sc.nextInt(),x=1;
        System.out.println("give row number");
        int row = sc.nextInt();
        while(x<=row){
            int y=1;
            while(y<=col){
        System.out.print("*");
        y++;
        }
        System.out.println();
        x++;
        }
    }
}
        
        
        