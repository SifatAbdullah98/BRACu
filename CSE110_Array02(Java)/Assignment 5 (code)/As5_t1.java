/*Task 1) Assume that we have the following array contains marks of 5 students.
int[] marks = new int[] {10, 30, 20, 50, 40}; Find the max, min, average mark.*/

class As5_t1 {
    public static void main (String[] args) {
        
        int marks[] = {10, 30, 20, 50, 40};;
        
        int max = marks[0];
        int min = marks[0];
        int sum = marks[0];
        
        for (int i=0 ; i<marks.length ; i++)
        {
            if (max<marks[i])
            {
                max=marks[i];
            }
            if (min>marks[i])
            {
                min=marks[i];
            }
            sum=sum+marks[i];
        }
        int arg = sum/marks.length;
        
        System.out.println("MAX="+max);
        System.out.println("MIN="+min);
        System.out.println("Average="+arg);
    }
}