// Write a program that takes a user input string and performs the following operations:

// 1. Find and print the length of the string.
// 2. Convert the string to uppercase and print it.
// 3. Convert the string to lowercase and print it.
// 4. Print the first character of the string.
// 5. Print the last character of the string.
// 6. Print the substring starting from the second character to the fifth character of the string

package ProgrammingChallenge;

import java.util.Scanner;

public class StringMethod{
    public static void main(String[] args) {
        new Task();
        
    }
}

class UInput{
    private String user;

    public void UInput(String user){
        this.user = user;
        
    }

    public void setUInput(String user){
        this.user = user;
        
    }

    public String getUInput(){
        // System.out.println(user);
        return user;
        
    }
}

class Task{

    public Task(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type any word: ");
        String a = sc.nextLine();

        UInput ui = new UInput();
        ui.setUInput(a);
        sc.close();

        //1. Find and print the length of the string.
        System.out.println(a.length());
        
        // 2. Convert the string to uppercase and print it.
        System.out.println(a.toUpperCase());
        
        // 3. Convert the string to lowercase and print it.
        System.out.println(a.toLowerCase());

        // 4. Print the first character of the string.
        System.out.println(a.substring(0, 1));
        
        // 5. Print the last character of the string.
        System.out.println(a.substring(a.length()-1));

        // 6. Print the substring starting from the second character to the fifth character of the string
        // trin
        System.out.println(a.substring(1, 5));

    }
}
    