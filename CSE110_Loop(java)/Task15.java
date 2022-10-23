import java.util.Scanner;
public class Task15{
    public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      System.out.println("give the value of n");
      int n = sc.nextInt();
      int y=0;
      while(n>=1){
          if(n%2==0){
          y=y-(n*n);
          }
          else{
           y=y+(n*n);
          }
          n=n-1;
      }
      System.out.println(y);
    }
}
        