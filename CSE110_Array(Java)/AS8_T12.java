import java.util.Scanner;
public class AS8_T12{
    public static void main(String[]args){
        int array[]=new int[5],i,j;
        Scanner sc = new Scanner(System.in);
        for(i=0;i<array.length;i++){
            System.out.println("Give the numbers");
            array[i]=sc.nextInt();
        }
        int max=array[0];
        
        for (j=0;j<array.length;j++)
        {
            if (array[j]>max)
            {
                max = array[j];
            }
        }
        System.out.println("Max Number="+max);
    }
}