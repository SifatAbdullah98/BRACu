//Task 8) Find median among some numbers.Ask user how many numbers and input those numbers.//

import java.util.Scanner;

    public class As5_t8 {
    public static void main (String[] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a value for array size:");
        int n = scan.nextInt();
        
        int a[] = new int [n];
        int j,i,temp;
        
        for (i=0 ; i<a.length ; i++)
        {
            System.out.println("Enter a values for array:");
            a[i] = scan.nextInt();
        }
        
        for (i=0 ; i<a.length ; i++)
        {
            for (j=1 ; j<a.length ; j++)
            {                
                if (a[j-1]>a[j])
                {
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        for(i =0 ; i<a.length ; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        
        if (n%2==0)
        {
            int p = a.length/2;
            double sum = a[p] + a[p+1];
            System.out.println("Median="+sum/2);
        }
        else 
        {
            int p = a.length/2;
            System.out.println("Median="+a[p]);
        }
    }
 }