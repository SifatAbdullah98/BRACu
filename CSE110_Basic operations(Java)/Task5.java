import java.util.Scanner;
public class Task5{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of the circle");
    int r = sc.nextInt();
    double circumference=(2*3.1416*r);
    double area=(3.1416*r*r);
    System.out.println(circumference);
    System.out.println(area);
    }
}