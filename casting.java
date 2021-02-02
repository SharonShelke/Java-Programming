public class casting {
    public static void main(String[] args) {
      
        

         int  num1=33;
         double numtodouble =num1;
         System.out.println("numtodouble=" +numtodouble);//widening - small datatype into larger datatype

         int num2= (int) numtodouble;
         System.out.println("double to int="+ num2);//narrowing large to small

              float var=45;
                System.out.println("value="+ var);
            int var2= (int) var;
            System.out.println("float to int"+ var2);

    }
}
