/*Q9) Ask user for quantity, take ID (int) and full name (String)  and mark (double) of that many students.
Print average mark and then print all names and IDs*/

import java.util.Scanner;

public class As5_t9 {
    public static void main (String[]args) {
        
         Scanner scan = new Scanner (System.in);
         
         System.out.println("Enter a value for array size:");
         int q = scan.nextInt();
         
         int id[] = new int [q];
         String name[] = new String [q];
         double m[] = new double [q];
         double sum=0;
         
         for (int i=0 ; i<q ; i++)
         {
             System.out.println(i+1+")Enter a Student ID:");
             id[i] = scan.nextInt();
             
             System.out.println(i+1+")Enter a Student Full Name:");
             name[i] = scan.next();
             
             System.out.println(i+1+")Enter Student marks:");
             m[i] = scan.nextDouble();
             sum = sum + m[i];
         }
         System.out.println("Average marks:"+(sum/q));
         
          for (int i=0 ; i<q ; i++)
         {
             System.out.println(i+1+")Student Name:"+name[i]);
             System.out.println("Student ID:"+id[i]);
             System.out.println();
         }
    }
}