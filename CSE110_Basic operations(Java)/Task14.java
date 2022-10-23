import java.util.Scanner;
public class Task14{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give an integer");
        int i = sc.nextInt();
        if(i%2==0){
            if(i>10){
            System.out.println("An even number greater than 10");
            }
            else{
                if(i==10){
                System.out.println("An even number not greater than 10");
                }
                else{}     
                
            }
        }
                else{
                if(i>10){
                System.out.println("An odd number greater than 10");
                }
                else{
                System.out.println("An odd number not greater than 10");
                }
            }
        
    }
}
        