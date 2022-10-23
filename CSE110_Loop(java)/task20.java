import java.util.Scanner;
public class task20{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Give a number");
        int y = sc.nextInt(),x=1,sum=0;
        while(x<=y){
            if(x%7==0){
            sum=sum+x;
            }
            x++;
        }
        System.out.println(sum);
    }
}
        
        