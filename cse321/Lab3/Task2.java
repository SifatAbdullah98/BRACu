public class Task2{
  public static void main(String[]args){
    Mythread House1 = new Mythread("House Stark");
    Mythread House2 = new Mythread("House Targaryen");
    Mythread House3 = new Mythread("House Lannister");
    Mythread House4 = new Mythread("House Bolton");
    Mythread House5 = new Mythread("House Tyrell");
    House1.setPriority(Thread.MAX_PRIORITY);
    House4.setPriority(Thread.MIN_PRIORITY);
    House1.start();
    House2.start();
    House3.start();
    House4.start();
    House5.start();
    try{
      House1.join();
      House2.join();
      House3.join();
      House4.join();
      House5.join();
    }
    catch (InterruptedException e){
      e.printStackTrace();
    }
    if(House1.isAlive()){
      System.out.println("Not Today!");
    }
    if(!House4.isAlive()){
      System.out.println("You know nothing!");
    }
  }
}
class Mythread extends Thread{
  
  public Mythread(String name){
    super(name);
  }

public void run(){
  System.out.println("The House is : " + Thread.currentThread().getName());
}
}
