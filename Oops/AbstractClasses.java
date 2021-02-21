package OOps;

/*
abstract class:-Which is having the keyword abstract.
A.C contains 2 type of methods abstract(which has only declaration & no body) & non abstract(method with body)
Abstrction:- hiding complexity & presenting the Simplicity
there are 2 ways to achieve abstraction:-1) interface 2) Abstract class
It cannot be instantiated(can't make a object).
Instantiation:-the process of creating objects.
it contains Static Methods & it also contains Constructor.
it can have final method

 */
public class AbstractClasses {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.display();
        obj.screen();

    }

}

class Student extends show {
    void display() {
        System.out.println("Non abstract method");
    }
}

abstract class show {
    abstract void display();// abstract

    public void screen() {
        System.out.println("Non abstract");
    }
}
