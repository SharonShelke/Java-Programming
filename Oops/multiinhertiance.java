package Oops;

public class multiinhertiance {
    public static void main(String[] args) {
        divi ob1=new divi();
        ob1.add();//sum
        ob1.mul();//multi
        ob1.div();//division
        
    }
    
}
class sum{
    int a,b,c;
    
    public void add(){
    a=10;
    b=20;
     c=a+b;
     System.out.println("result="+c);

    }

}
class mult extends sum{
    int i,j,k;
    public void  mul(){
        i=4;
        j=2;
    
        c=a*b;
        System.out.println("muti res="+c);
        
    }
}
class divi extends mult{
   
    public void div(){
        k=i/j;
        System.out.println(k);
    }
}
