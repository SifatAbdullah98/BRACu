import java.util.Scanner;
public class task35{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the hour in 24 format");
    int h = sc.nextInt();
    if(h<0){
    System.out.println("Wrong time");
    }
    else{
        if(h<4){
        System.out.println("Patience is a virtue");
        }
        else{
         if(h<=6){
        System.out.println("Breakfast");
        }
         else{
         if(h<12){
        System.out.println("Patience is a virtue");
        }
         else{
         if(h<=13){
        System.out.println("lunch");
         }else{
          if(h<16){
        System.out.println("Patience is a virtue");
         }
          else{
              if(h<=17){
        System.out.println("Snacks");
        }
              else{
              if(h<19){
        System.out.println("Patience is a virtue");
        }
           else{
              if(h<=20){
        System.out.println("Dinner");
        }
               else{
              if(h<=23){
        System.out.println("Patience is a virtue");
        }
               else{
        System.out.println("Wrong time");
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
