import java.util.Scanner;
public class Task23{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the heigt of Rectangle");
        int h = sc.nextInt();
        System.out.println("Give the width of Rectangle");
        int w = sc.nextInt();
        int Area = h*w;
        System.out.println(Area);
    }
}