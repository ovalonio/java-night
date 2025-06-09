//Count number of words in an input

package ProgrammingChallenge;

import java.util.Scanner;

public class CountNumberOfWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Type a short paragraph or sentence: ");
        String z = sc.nextLine();

        String[] x = z.trim().split("\\s+");
        System.out.print("The number of word/words you have: ");
        int y = x.length;
        System.out.println(y);

        sc.close();

    }
}
