package Oops;


public class inherti {
    public static void main(String[] args) {
      subclass ob1= new subclass();
      ob1.div();
      ob1.sub();


    }
    
}
class divclass{
    int a,b,c;
   public void div(){
        a=7;
        b=5;
        c=a/b;
        System.out.println("div="+ c);
    }
}

class subclass extends divclass{

    public void sub(){
    c=a-b;
    System.out.println("subtraction="+c);
    }
}
