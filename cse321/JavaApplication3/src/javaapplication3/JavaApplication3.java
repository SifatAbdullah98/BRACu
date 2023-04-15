import java.util.*;
import java.io.*;

public class JavaApplication3 {

    public static void main(String[] args) throws Exception{
      BufferedReader b = new BufferedReader(new FileReader("input.txt"));
      int r = Integer.parseInt(b.readLine());
      int c = Integer.parseInt(b.readLine());
      String[] process= new String[r];
      int [][] max = new int[r][c];
      int [][] allocation = new int[r][c];
      int [][] need = new int[r][c];
      int [][] available = new int[r+1][c];
      LinkedList<Integer> track= new LinkedList<Integer>();
      String s3 = b.readLine();
      StringTokenizer st3 = new StringTokenizer(s3," ");
      int n=0;
      while(st3.hasMoreTokens()){
        process[n]=st3.nextToken();
        n++;
      }
      for(int i=0;i<r;i++){
        String s = b.readLine();
        StringTokenizer st = new StringTokenizer(s," ");
        for(int j=0;j<c;j++){
          max[i][j]=Integer.parseInt(st.nextToken());
        }
      }
      for(int i=0;i<r;i++){
        String s = b.readLine();
        StringTokenizer st = new StringTokenizer(s," ");
        for(int j=0;j<c;j++){
          allocation[i][j]=Integer.parseInt(st.nextToken());
          need[i][j]= max[i][j]-allocation[i][j];
        }
      }
      System.out.print("Need Matrix: ");
       for(int i=0;i<r;i++){
         System.out.println();
        for(int j=0;j<c;j++){
          System.out.print(need[i][j] +" ");
        }
      }
       System.out.println();
       String s = b.readLine();
       StringTokenizer st = new StringTokenizer(s," ");
       
       int counter=0;
       while(st.hasMoreTokens()){
        available[0][counter]=Integer.parseInt(st.nextToken());
        counter++;
      }
       counter=0;
       
       for(int i=0;;i++){
         i=i%r;
         boolean flag= true;
         for(int j=0;j<c;j++){
           if(need[i][j]<=available[counter][j]){
             
           }
           else{
             flag=false;
             break;
           }
           if(flag && j==(c-1) && !track.contains(i)){
             for(int k=0; k<c;k++){
               available[counter+1][k]=available[counter][k]+allocation[i][k];
             }
             track.addLast(i);
             counter++;
           }
         }
         if(track.size()==r){
           break;
         }
       }
       System.out.print("Safe sequence: ");
       for(int i=0;i<track.size();i++){
         System.out.print(process[track.get(i)]+ " ");
       }
       System.out.println();
       System.out.print("Change in available resourse matrix: ");
       for(int i=1;i<available.length;i++){
         System.out.println();
        for(int j=0;j<c;j++){
          System.out.print(available[i][j] +" ");
        }
      }
       System.out.println();
    }
}
       