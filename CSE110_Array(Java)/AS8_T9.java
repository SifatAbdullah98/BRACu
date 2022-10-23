import java.util.Scanner;
public class AS8_T9{
    public static void main(String[]args){
        int array[]=new int[10],i,j,c=0;
        Scanner sc = new Scanner(System.in);
        for(i=0;i<array.length;i++){
            System.out.println("Give the numbers");
            array[i]=sc.nextInt();
        }
        System.out.println("giave a number");
        int n = sc.nextInt();
        for(j=0;j<array.length;j++){
            if(array[j]==n){
                c++;
            }
        }
        if(c<1){
            System.out.println("no");
        }
        else{
            System.out.println("yes");
        }
        
    }   
}