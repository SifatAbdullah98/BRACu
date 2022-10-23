/*Task 4) Assume that we have the following array. int[] a = new int[] {10, 30, 20, 50, 40};
Modify Task 3. Swap the first number with largest numbe*/

public class As5_t4 {
    public static void main (String[] args) {
        
        int n[] = {10, 30, 20, 50, 40};;
        
        int max=n[0];
        int p=0,i;
        
        for (i=0 ; i<n.length ; i++)
        {
            if (n[i]>max)
            {
                max = n[i];
                p = i;
            }
        }
        
        int temp = n[0];
        n[0] = max;
        n[p] = temp;
        
        for (i=0 ; i<n.length ; i++)
        {
           System.out.println(n[i]);
        }
    }
}