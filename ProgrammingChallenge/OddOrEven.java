// Odd or even? positive or negative? or zero?

package ProgrammingChallenge;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        new InpNumber();
    }    
}

class InpNumber{
    public InpNumber(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Input any number: ");
        int x = sc.nextInt();

        String y = ( x % 2 == 0 ) ? x + " = even" : x +" = odd";
        System.out.print(y);

        if (x == 0)
            System.out.print(" with zero");
            if (x <= 0)
                System.out.println(" and negative");

        else if ( x >= 0)
            System.out.println(" and positive");

        sc.close();
    }
}



