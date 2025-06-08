//Check vowels and consonants

package ProgrammingChallenge;

import java.util.Scanner;

public class CheckVowelAndConsonant {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Type 'a letter only' to check if it's vowel or consonant");
        String a = sc.nextLine();

        String[] vowel = {"a", "e", "i", "o", "u"};
        String[] consonant = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};

        for (String x: vowel){
            if (a.equalsIgnoreCase(x)){
                System.out.println("'" + a + "'" + " is vowel");
            }
        }
        for (String y: consonant)
            if (a.equalsIgnoreCase(y)){
            System.out.println("'" + a + "'" + " is consonant");
        }
        sc.close();
    }
}
