public class task21{
public static void main(String[]args){
      int i=1,sum=0;
      while(i<=300){
          if(i%7==0){
              if(i%9==0){
              sum=sum+i;
              }
          }
          i++;
      }
      System.out.println(sum);
    }
}
        