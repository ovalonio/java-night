package Task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Type a number to check the largest number");
    System.out.print("input 1: ");
    int input1 = sc.nextInt();
    System.out.print("input 2: ");
    int input2 = sc.nextInt();
    System.out.print("input 3: ");
    int input3 = sc.nextInt();
    
    if(Integer.valueOf(input1) > input2 && Integer.valueOf(input1) > input3){
        System.out.println(input1 + " is the largest number");
    }
    else if (Integer.valueOf(input2) > input1 && Integer.valueOf(input2) > input3){
        System.out.println(input2 + " is the largest number");
    }
    else if(Integer.valueOf(input3) > input1 && Integer.valueOf(input3) > input2){
        System.out.println(input3 + " is the largest number");
    }
    else if (Integer.valueOf(input1) == input2 && Integer.valueOf(input1) == input3){
        System.out.println("All numbers are equal");
    }

    sc.close();
    }
}
