import java.util.Scanner;
public class Task26{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("give your working hours per week");
        int h = sc.nextInt();
        if(h<=40){
            int salary=(h*40);
            System.out.println(salary);
        }
        else{
        int salary=(8000+((h-40)*300));
        System.out.println(salary);
        }
}
}