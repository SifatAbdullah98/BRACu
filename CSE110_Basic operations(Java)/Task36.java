import java.util.Scanner;
        public class Task36{
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Give your grades of CSE110");
            int a = sc.nextInt();
            System.out.println("Give your grades of ENG091");
            int b = sc.nextInt();
            System.out.println("Give your grades of MAT110");
            int c = sc.nextInt();
            System.out.println("Give your grades of PHY111");
            int d = sc.nextInt();
            double gpa = ((a*3)+(b*0)+(c*3)+(d*3))/(3+0+3+3);
            System.out.println(gpa);
        }
        }