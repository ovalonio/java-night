//Integer input from the user and uses a for loop to generate following pattern

package ProgrammingChallenge;

public class GeneratePattern{
    public static void main(String[] args) {
        int row = 5;

        for (int a = 1 ; a <= row ; a++){
            for (int b = 1; b <= a ; b++)
                System.out.print("+");

            System.out.println();
            
        }
    }
}

