public class task4array {
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