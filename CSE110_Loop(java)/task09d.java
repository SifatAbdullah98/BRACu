public class task09d{
    public static void main(String[]args){
        int x=18;
        while(x>=-63){
            if(x==63){
            System.out.print(x);
            }
            else{
            System.out.print(x+",");
            }
            if(x>=0){
                x=x-9;
            }
            else{
            x=x+9;
            }
            x=x*(-1);
            
        }
    }
}