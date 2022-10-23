/*Q10) Ask user for quantity and take that many numbers (int) from user.Print YES/NO. Print YES if numbers are 
 strictly increasing. NO otherwise.That means all later numbers are larger than all previous numbers.*/

import java.util.Scanner;

public class As5_t10 {
    public static void main (String[]args) {
        
         int  c = 0;
         
         Scanner scan = new Scanner (System.in);
         
         System.out.println("Enter a value for array size:");
         int q = scan.nextInt();
         
         int a[] = new int [q];
         
         for (int i=0 ; i<a.length ; i++)
         {
             System.out.println(i+1+")Enter a Number");
             a[i] = scan.nextInt();
         }
         
         for (int i=0 ; i<a.length-1 ; i++)
         {
              if(a[i]<a[i+1])
              {
                  c++;
              }
         }
         if (q-1 == c )
         {
              System.out.println("Yes");
         }
         else
         {
              System.out.println("NO");
         }
    }
}