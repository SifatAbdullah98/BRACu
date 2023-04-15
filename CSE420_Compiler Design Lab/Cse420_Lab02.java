import java.util.*;
import java.io.*;


public class Cse420_Lab02{  
  public static void main(String[]args)throws FileNotFoundException{
    File input= new File("F:\\lab02.txt");
    Scanner sc = new Scanner(input); 
    String address = null;
    int test_count = Integer.parseInt(sc.nextLine());
    System.out.println(test_count);
    
    for (int i = 0; i < test_count;i++) {
      address = sc.nextLine();
      boolean Test_Result = false;
      String type = null;
      
      if (address.contains("@")) {
        type = "email";
      } else if (!(address.contains("@")) && (address.contains("."))) {
        type = "web";
      }  
      
         if (type == "email") {
        String[] splitMail = address.split("\\@");
        String[] splitMail2 = null;       
        int splitMail2_Length = 0;
        int countMail = 0;
        int countMail2 = 0;     
        for (int j = 0; j < splitMail.length; j++) {          
          if (!(splitMail[j].contains("."))) {    
            char[] mailpart = splitMail[j].toCharArray();
            boolean mailResult = false;
            
            for (int k = 0; k < mailpart.length; k++) {
              if (mailpart[k] >= 'a' && mailpart[k] <= 'z' || mailpart[k] >= '0' && mailpart[k] <= '9') {
                mailResult = true;
              } 
            }            
            if (mailResult == true) {
              countMail++;
            }            
          }
          else if (splitMail[j].contains(".")) {
            splitMail2= splitMail[j].split("\\.");
            
            splitMail2_Length = splitMail2.length;
            
            for (int l = 0; l < splitMail2.length; l++) {
              char[] mailpart2 = splitMail2[l].toCharArray();
              boolean mailResult2  = false;
              
              for (int m = 0; m < mailpart2.length; m++) {
                if (mailpart2[m] >= 'a' && mailpart2[m] <= 'z' || mailpart2[m] >= '0' && mailpart2[m] <= '9') {
                  mailResult2 = true;
                }               
                if (mailResult2 == true) {
                  countMail2++;
                }
              }              
            }
          }        
          if ((countMail + countMail2) == (splitMail.length + splitMail2_Length - 1)) {
            Test_Result = true;
          }    
        }     
      }
      
      if (type == "web") {
        String[] splitWeb = address.split("\\.");
        int countWeb = 0;
        
        for (int j = 0; j < splitWeb.length; j++) {
          char[] webpart = splitWeb[j].toCharArray();
          boolean webResult = false;
          
          for (int k = 0; k < webpart.length; k++) {
            if (webpart[k] >= 'a' && webpart[k] <= 'z' || webpart[k] >= '0' && webpart[k] <= '9') {
              webResult = true;
            } 
          }         
          if (webResult == true) {
            countWeb++;
          }
        }       
        if (countWeb == splitWeb.length) {
          Test_Result = true;
        }    
      }   
      if (Test_Result = true) {
        System.out.println(type + ", " + (i + 1));
      } else {
        System.out.println("Invalid" + ", " + (i + 1));
      }     
    }
  }  
}
