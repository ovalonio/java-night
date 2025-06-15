// Task4.java
// Write a program that takes a string as input and checks if it is a palindrome. A palindrome is a word, number, or other sequence of characters that reads the same forward and backward.
// Your program should perform the following steps:

// Use StringBuilder to create a new string that is a reverse of the input string.
// Use the equals() method to check if the input string and the reversed string are the same.
// If the strings are the same, print "The input string is a palindrome."
// If the strings are not the same, print "The input string is not a palindrome."

package Task4;

import java.util.Scanner;

public class Task4{
    public static void main(String[] args) {
        StringBuilder reverseString = new StringBuilder();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Type a word, number, or other sequence of characters to check if it palindrome");
        System.out.print("@/> ");
        String input = sc.nextLine();
        int y = input.length();
        int z = input.length();

        try {
            y += 1;
            for (int x = y ; x >= 0 ; x-- ){
                // System.out.println(input.substring( z -= 1  , y -= 1));
                z -= 1;
                y -= 1;
                reverseString.append(input.substring( z  , y ));
            }
        }catch (StringIndexOutOfBoundsException e){
            // System.out.println(reverseString);
            // System.out.println(e);
        }

        sc.close();

        if (input.equals(reverseString.toString())){
            System.out.println("The input string is a palindrome.");
        }else
            System.out.println("The input string is not a palindrome.");

    }
}




    