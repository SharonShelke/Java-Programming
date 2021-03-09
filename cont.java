package Oops;

public class cont{
    // we are shifiting the control of program.
    // break continue switch
    // break is used to get exit from loop
    // Continue skips a statement
    public static void main(String[] args) {
        System.out.println("Break Statement");
        int i;
        for (i = 0; i <= 10; i++) {
            if (i == 5) {// 0==5,1==0, 2==5,3==5,4==5,5==5
                break;
            }
            System.out.println(i);// 0,1, 2,3,4

        }
        System.out.println("Continue Statement");

        int j;
        for (j = 0; j <= 10; j++) {
            if (j == 1) {
                continue;

            }
            System.out.println(j);

        }

        System.out.println("Continue with while");
        int k = 15;
        while (k <= 20) {// 15 true 18
            if (k == 15) {// 19==19
                k++;// 20
                continue;

            }
            System.out.println(k);// 15,16,17,18
            k++;// 18, 19

        }

    }

}

    
}
