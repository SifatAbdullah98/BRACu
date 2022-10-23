/*Task 5) Assume that we have the following array. int[] a = new int[] {50, 30, 20, 10, 40};
Find largest number among all numbers between 2nd and last number (30, 20, 10, 40).
Swap the 2nd number with this largest number. Thus you just put 2nd largest in 2nd position.*/

public class As5_t5 {
    public static void main (String[] args) {
        
        int n[] = {50, 30, 20, 10, 40};
        
        int max=n[1];
        int p=0,i;
        
        for (i=1 ; i<n.length ; i++)
        {
            if (n[i]>max)
            {
                max = n[i];
                p = i;
            }
        }
        
        int temp = n[1];
        n[1] = max;
        n[p] = temp;
        
        for (i=0 ; i<n.length ; i++)
        {
           System.out.println(n[i]);
        }
    }
}