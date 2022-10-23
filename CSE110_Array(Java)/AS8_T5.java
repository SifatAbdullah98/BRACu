import java.util.Scanner;
public class AS8_T5{
    public static void main(String[]args){
        int array[]=new int[10],i,j;
        Scanner sc = new Scanner(System.in);
        for(i=0;i<array.length;i++){
        System.out.println("Give the numbers");
        array[i]=sc.nextInt();
        }
        
        for(j=0;j<array.length;j++){
            if(array[j]%2==0){
            System.out.println(array[j]);
             j=array.length;
            }
            }
        }
    }