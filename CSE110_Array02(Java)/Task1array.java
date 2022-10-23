public class Task1array{
    public static void main(String[]args){
        int mark[] = {10,30,20,50,40};
        int i,n=0,sum=0;
        int max=mark[0];
        int min=mark[0];
        for(i=1; i<=5; i++){
            if(max<mark[n]){
                max=mark[n];
            }
            if(mark[n]<min){
                min=mark[n];
            }
            sum=sum+mark[n];
            n++;
        }
        int average=sum/5;
        System.out.println(max);
        System.out.println(min);
        System.out.println(average);
    }
}