public class Task2array{
    public static void main(String[]args){
        int mark[] = {10,30,20,50,40};
        int sum=0,s=0,i;
        for(i=0;i<5;i++){
        sum=sum+mark[i];
        }
        int average= sum/5;
        for(int j=0;j<5;j++){
            if(mark[j]>average){
            s++;
            System.out.println("the mark is="+mark[j]); 
            } 
        }
        System.out.println("number of student="+s);
    }
}