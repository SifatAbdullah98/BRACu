import java.util.Scanner;

    public class task6array {
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
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a value for 'N' to find nth highest number:");
        int n = scan.nextInt();
        
        System.out.println("The nth highest number is: "+arr[n]);
    }
}