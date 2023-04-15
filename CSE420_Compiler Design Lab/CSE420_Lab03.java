import java.util.*;
import java.io.*;
import java.util.regex.*;

public class CSE420_Lab03_19101384{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of RE");
        int n= sc.nextInt();
        String[] Regex_Array = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the "+ (i+1) +" RE");
            Regex_Array[i] = sc.next();
        }    
        System.out.println("Enter the number of Line");
        int n_l= sc.nextInt();
        String[] Line_Array = new String[n_l];
        for (int i = 0; i < n_l; i++) {
            System.out.println("Enter the "+ i+1 +" Line");
            Line_Array[i] = sc.next();
        }
        for (int i = 0; i < n_l; i++) {
            boolean result;
            int count = 0;
            for (int j = 0; j < n; j++) {
                result = Pattern.matches(Regex_Array[j], Line_Array[i]);
                if (result == true) {
                    System.out.println("Yes, " + (j + 1));
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("No, " + count );
            }
        }
    }
}