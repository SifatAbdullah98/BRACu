import java.util.Scanner;
public class AS8_T10{
    public static void main(String[]args){
        int array[]=new int[10],i,j,c=0;
        Scanner sc = new Scanner(System.in);
        for(i=0;i<array.length;i++){
            System.out.println("Give the numbers");
            array[i]=sc.nextInt();
            for(j=0;j<i;j++){
                System.out.print(array[j]+",");
            }
            if(i==j){
                System.out.println(array[i]);
            }
            else{
            System.out.print(array[i]+",");
            }
        }
    }
}
