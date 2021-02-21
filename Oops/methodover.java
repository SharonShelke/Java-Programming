public class methodover{
    public static void main(String[] args) {//method name same number arugment same 
      display obj= new display();
      obj.disp('a');
      obj.disp(10);
    }
}
class display{
    public void disp(char c){
        System.out.println(c);
    }
    public void disp(int c){
        System.out.println(c);
    }
}
