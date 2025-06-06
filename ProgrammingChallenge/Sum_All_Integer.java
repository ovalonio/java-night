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
            String txt = sc.nextLine();
            
            if (txt.equalsIgnoreCase("exit")){
                System.out.println("  closing... ");
                System.out.println();
                System.out.println();
                break;
            }
                
                try{
                    int sumY = Integer.parseInt(txt);
                    sumX += sumY;

                }catch (NumberFormatException e) {
                    System.out.println("Enter valid number or type 'exit'");

                }catch (IllegalStateException ee) {
                    sc.close();
                }
        }
    }
}