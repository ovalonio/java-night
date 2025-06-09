//Sum and average of input array numbers

package ProgrammingChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class SumAndAverage{
    public static void main(String[] args) {
        new Input();
    }
}


class Input{
    public Input(){
        int[] number = new int[3];
        int sumNum = 0;
        double aveSumNum;

        Scanner sc = new Scanner(System.in);
        System.out.println("'Type numbers to get the average'");
        for (int y =0 ; y <= 2 ; y++ ){
            System.out.print("Enter number: ");
            number[y] = sc.nextInt();
        }
        sc.close();

        for (int x: number){
            sumNum += x;
        }
        System.out.println("====================");
        System.out.println("Sum of numbers: " + sumNum);
        aveSumNum = sumNum / number.length;
        System.out.println("The average is: " + aveSumNum);

    }
}
