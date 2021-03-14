package Oops;

public class lambdaexpression {
    interface lambda{
        public String say();
    }
   
         public static void main(String[] args) {
             lambda s=()->{
    
    
                return" I have nothing to say.";
             };
             System.out.println(s.say());  
            }
        
    
    
        }
    }

    

