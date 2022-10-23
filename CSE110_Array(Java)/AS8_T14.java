import java.util.Scanner;
public class AS8_T14{
    public static void main(String[]args){
        int array[]=new int[5],i,j;
        Scanner sc = new Scanner(System.in);
        for(i=0;i<array.length;i++){
            System.out.println("Give the numbers");
            array[i]=sc.nextInt();
        }
        int max=array[0];
        int l=0,n=0;
        int min=array[0];
        for (j=0;j<array.length;j++)
        {
            if (array[j]>max)
            {
                max = array[j];
                n=j;
            }
            if (array[j]<min)
            {
                min = array[j];
                l=j;
            }
        }
        System.out.println("Max Number="+max);
        System.out.println("Index Number of max="+n);
        System.out.println("Min Number="+min);
        System.out.println("Index Number of min="+l);
    }
}