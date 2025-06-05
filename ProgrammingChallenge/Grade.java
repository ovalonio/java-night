// Score to Grade F - A
// Write a program that takes in the score of a student in a test and outputs their grade based on the following criteria:

// A score of 90 or above gets an A grade
// A score between 80 and 89 gets a B grade
// A score between 70 and 79 gets a C grade
// A score between 60 and 69 gets a D grade
// A score below 60 gets an F grade

package ProgrammingChallenge;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
    new InputScore();    
    }
}

class InputScore{
    public InputScore(){
        Scanner sc = new Scanner(System.in);  
        
        System.out.print("Enter student score: ");
        int x = sc.nextInt();

        if (x <= 100){
            String a =  (x <= 60) ? "Grade F": 
                (x <= 69) ? "Grade D":
                (x <= 79) ? "Grade C":
                (x <= 89) ? "Grade B": 
                (x <= 100) ? "Grade A": "";
            System.out.println(a);
            sc.close();
        }
        else if (x >= 101 ){
            System.out.println();
            System.out.println("(1 - 100 digit only)");
            new InputScore();
            sc.close();
        }
    }
}

