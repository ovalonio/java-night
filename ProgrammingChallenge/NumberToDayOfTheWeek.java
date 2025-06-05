// create a program that will accept 1-7 inputs and print the day in a week that corresponds with that number
// 1	Monday
// 2	Tuesday
// 3	Wednesday
// 4	Thursday
// 5	Friday
// 6	Saturday
// 7	Sunday
// Any other number or character must print invalid input

package ProgrammingChallenge;

import java.util.Scanner;
import java.time.DateTimeException;
import java.time.DayOfWeek;

public class NumberToDayOfTheWeek {
    public static void main(String[] args) {
        new InputNumber();
    }
}

class InputNumber{
    public InputNumber()  { 
        Scanner sc = new Scanner(System.in);
        Print();
        int x = sc.nextInt();
        try{
            DayOfWeek dow = DayOfWeek.of(x);
            if (x <= 7 ){
                System.out.println(x + " is " + dow);
                sc.close();}
        } catch (DateTimeException y){
                System.out.println("invalid number");
        }       
    }

    public void Print(){
        System.out.print("Type a number raning from 1-7: ");
    }
}



