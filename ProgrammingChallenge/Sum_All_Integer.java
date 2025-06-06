//Sum of All integer Inputs

package ProgrammingChallenge;

import java.util.Scanner;

public class Sum_All_Integer {
    public static void main(String[] args) {
        new Initialize();
    }
}

class Initialize{
    public Initialize(){
        int sumX = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Type number to sum up");
        
        while (true){
            
            System.out.print("= " + sumX + " + ");
            String textInput = sc.nextLine();
            
            if (textInput.equalsIgnoreCase("exit")){
                System.out.println("  closing... ");
                break;
            }
                
                try{
                    int sumY = Integer.parseInt(textInput);
                    sumX += sumY;

                }catch (NumberFormatException e) {
                    System.out.println("Enter valid number or type 'exit'");

                }catch (IllegalStateException ee) {
                    sc.close();
                }
        }
    }
}