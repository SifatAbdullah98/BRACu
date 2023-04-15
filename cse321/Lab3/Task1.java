import java.util.Scanner;
public class Task1{
  public static void main(String[]args){
    System.out.println("Enter the values");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    MyThread add = new MyThread("add");
    MyThread sub = new MyThread("sub");
    MyThread mul = new MyThread("mul");
    MyThread div = new MyThread("div");
    MyThread oth = new MyThread("oth");
    add.add(x,y);
    sub.sub(x,y);
    mul.mul(x,y);
    div.div(x,y);
    oth.oth(x,y);
  }
}

class MyThread extends Thread{
  
  public MyThread(String name){
    super(name);
  }

public void add(int a, int b){
  int c= a+b;
  System.out.println("Add = " +c);
}
public void sub(int a, int b){
  int c= a-b;
  System.out.println("Sub = "+c);
}
public void mul(int a, int b){
  int c= a*b;
  System.out.println("Mul = "+c);
}
public void div(int a, int b){
  int c= a/b;
  System.out.println("Div = "+c);
}
public void oth(int a, int b){
  System.out.println("No valid operation");
}
}



