import java.util.Scanner;
public class Task16{
    public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      System.out.println("give the value of n");
      int n = sc.nextInt();
      int y=0;
      while(n>=1){
         y=y+(n/((2*n)-1));
          n=n-1;
      }
      System.out.println(y);
    }
}
        