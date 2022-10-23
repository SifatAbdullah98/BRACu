/*Task 2) Assume that we have the following array contains marks. int[] marks = new int[] {10, 30, 20, 50, 40};
Find how many students are better than average.*/

class As5_t2 {
    public static void main (String[] args) {
        
        int marks[] = {10, 30, 20, 50, 40};;
        
        int sum = 0;
        
        for (int i=0 ; i<marks.length ; i++)
        {
            sum=sum+marks[i];
        }
        int arg = sum/marks.length;
        
        int b=0;
        
        for (int i=0 ; i<marks.length ; i++)
        {
            if (arg>marks[i])
            {
                b++;
            }
        }
        System.out.println("Better Than Average "+b+" Students");
    }
}