public class task5array {
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