package OOps;

public class Interface {
    /*
     * it is a blueprint of class. to achieve multiple inheritance Abstraction
     * Static Constants abstract methods. Syntax:- interface <interface name>
     * 
     */
    public void myfun() {
        System.out.println("Defined in class & called in interface");
    }

    public static void main(String[] args) {

        System.out.println("Java");
        Interface obj = new Interface();
        obj.myfun();

    }

}

interface firstone {
    void myfun();

}
