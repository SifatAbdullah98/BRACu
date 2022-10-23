//Task 7) Modify Task 5 to sort / arrange all numbers in the array.//

import java.util.Scanner;

    public class As5_t7 {
    public static void main (String[] args) {
        
        int arr[] = {50, 30, 20, 10, 40};
        
        int j,i,temp;
        
        for (i=0 ; i<arr.length ; i++)
        {
            for (j=1 ; j<arr.length ; j++)
            {                
                if (arr[j-1]<arr[j])
                {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for (int k=0 ; k<arr.length ; k++)
        {
            System.out.print(arr[k]+", ");
        }
        System.out.println();
    }
 }