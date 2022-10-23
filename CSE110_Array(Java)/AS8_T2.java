import java.util.Scanner;
public class AS8_T2{
    public static void main(String[]args){
        int array[]=new int[10],i;
        Scanner sc = new Scanner(System.in);
        for(i=0;i<array.length;i++){
        System.out.println("Give the numbers");
        array[i]=sc.nextInt();
        }
        System.out.println("give a number");
        int n= sc.nextInt();
        System.out.println(array[n]);
    }
}