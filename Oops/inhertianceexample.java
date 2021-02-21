package Oops;

public class inhertianceexample {
    public static void main(String[] args) {
        childclass ob1=new childclass();
        ob1.sum();
        ob1.mutiply();
    }
    
}
class baseclass{
    int a,b,c;//global varaible
    public void sum(){
        a=2;
        b=3;
        c=a+b;
        System.out.println("sum="+c);
    }
}
class childclass extends baseclass{
     
    public void mutiply(){
        c=a*b;
        System.out.println(c);
    }
}
