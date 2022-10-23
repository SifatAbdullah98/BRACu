import java.util.Scanner;
public class task21{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
    System.out.println("Give your mark");
    int m = sc.nextInt();
    if(m>=90){
    System.out.println("A");
    }
    else{
        if(m>=80){
        System.out.println("B");
        }
        else{
         if(m>=70){
        System.out.println("c");
        }
         else{
         if(m>=60){
        System.out.println("D");
        }
         else{
         if(m>=50){
        System.out.println("E");
         }else{
          System.out.println("F");
         }
         }
         }
        }
       
    }
    }
}