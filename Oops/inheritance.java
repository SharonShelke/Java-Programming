package Oops;

public class inheritance {
    public static void main(String[] args) {
        childclass ob1 = new childclass();
        ob1.fun();
        ob1.fun2();


    }

    
}
class parentclass {
  public void fun(){
      System.out.println("I am in base class");
  }
}
class childclass extends parentclass{
    public void fun2(){
        System.out.println("I am a child class");
    }
}