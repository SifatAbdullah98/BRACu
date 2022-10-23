    import java.util.Scanner;
        public class Task29{
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Give the value of one side");
            int x = sc.nextInt();
            System.out.println("Give the value of other side");
            int y = sc.nextInt();
            System.out.println("Give the value of another side");
            int z = sc.nextInt();
            int s = (x+y+z)/2;
            double area = Math.sqrt(s*(s-x)*(s-y)*(s-z));
            System.out.println(area);
        }
    }
                
             