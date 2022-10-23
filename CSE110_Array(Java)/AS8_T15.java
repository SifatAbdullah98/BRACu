import java.util.Scanner;
public class AS8_T15 {
    public static void main(String[]args){
        int array[]=new int[5],i,j,k;
        Scanner sc = new Scanner(System.in);
        for(i=0;i<array.length;i++){
            System.out.println("Give the numbers");
            array[i]=sc.nextInt();
        }
        
        
        for (j=0 ; j<array.length ; j++){
            int min=j;
            for(k=j+1;k<array.length;k++){
            if (array[k]<array[min])
            {
                min=k;
            }
        }
              int temp = array[j];
              array[j] = array[min];
              array[min] = temp;
        
        }
        for (int n=0 ; n<array.length ; n++)
        {
           System.out.println(array[n]);
        }
    }
}