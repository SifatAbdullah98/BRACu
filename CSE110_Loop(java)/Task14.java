import java.util.Scanner;
public class Task14{
    public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      System.out.println("give the value of n");
      int n = sc.nextInt();
      int sum=0;
      while(n>=1){
          sum=sum+(n*n*n);
          n=n-1;
      }
       double y = Math.cbrt(sum); 
      System.out.println(y);
    }
}
        