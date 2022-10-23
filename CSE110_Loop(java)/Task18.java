public class Task18{
    public static void main(String[]args){
      int x=1,sum=0;
      while(x<=600){
          if(x%7==0){
              sum=sum+x;
          }
          else{
              if(x%9==0){
              sum=sum+x;
              }
          }
          x++;
      }
      System.out.println(sum);
    }
}
        