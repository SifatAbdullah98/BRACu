import java.util.Scanner;
public class task22{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
    System.out.println("Give your mark");
    int m = sc.nextInt();
    if(m>=90){
    System.out.println("A(4.0)Excellent");
    }
    else{
        if(m>=85){
        System.out.println("A-(3.7)");
        }
        else{
         if(m>=80){
        System.out.println("B+(3.3)");
        }
         else{
         if(m>=75){
        System.out.println("B(3.0)Good");
        }
         else{
         if(m>=70){
        System.out.println("B-(2.7)");
         }else{
          if(m>=65){
        System.out.println("C+(2.3)");
         }
          else{
              if(m>=60){
        System.out.println("C(2.0)Fair");
        }
              else{
              if(m>=57){
        System.out.println("C-(1.7)");
        }
           else{
              if(m>=55){
        System.out.println("D+(1.3)");
        }
               else{
              if(m>=52){
        System.out.println("D(1.0)Poor");
        }
               else{
              if(m>=50){
        System.out.println("D-(0.7)");
        }
               else{
        System.out.println("F(0.0)Failure");
        }
         } 
         }         
         }
         }
         }
         }
         }
         }
        }
    }
    }
}