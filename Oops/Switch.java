package Oops;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int num1,num2;
        Scanner scanner=new Scanner(System.in);//accepting input from user
        System.out.println("Enter the first number");
        num1= scanner.nextInt();//take a integer input
        System.out.println("Enter the second number");
        num2=scanner.nextInt();
        System.out.println("Enter the operator (+,-,*,/):");
        char calculate=scanner.next().charAt(0); 
       

       switch(calculate){

           case '+':
           System.out.println(num1+num2);
           break;
           case '-':
           System.out.println(num1-num2);
           break;
           case '*':
           System.out.println(num1*num2);
           break;
           case '/':
           System.out.println(num1/num2);
           break;
           default:
           System.out.println("Invaid calculation");
       }

    }
    
}
