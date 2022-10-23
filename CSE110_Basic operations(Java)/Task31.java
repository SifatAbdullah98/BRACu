    import java.util.Scanner;
        public class Task31{
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Give the number of courses");
            int x = sc.nextInt();
            System.out.println("Give the credit of each course");
            int y = sc.nextInt();
            System.out.println("Give the cost per credit");
            int z = sc.nextInt();
            int cost = (x*y*z);
            System.out.println(cost);
        }
        }