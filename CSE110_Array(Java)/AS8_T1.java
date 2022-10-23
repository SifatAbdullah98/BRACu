import java.util.Scanner;
public class AS8_T1{
    public static void main(String[]args){
        int array[]=new int[4],sum=0,i,j;
        Scanner sc = new Scanner(System.in);
        for(i=1;i<array.length;i++){
        System.out.println("Give the numbers");
        array[i]=sc.nextInt();
        sum=sum+array[i];
        array[0]=sum;
        }
        for(j=0;j<array.length;j++){
            System.out.print(array[j]+", ");
        }
    }
}