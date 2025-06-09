// StringBuilder - 10 characters
// Write a program that prompts the user to enter a string of at least 10 characters. Using the StringBuilder class, perform the following operations:

// Print the length of the string.
// Print the first character of the string.
// Print the last character of the string.
// Print the index of the first occurrence of the letter 'a' in the string.
// Print the substring of the string from index 3 to index 6.
// Append the string "123" to the end of the string.
// Insert the string "xyz" at index 4.
// Delete the substring from index 2 to index 4.
// Delete the character at index 8.
// Reverse the string and print it.
// Your program should utilize the charAt(), indexOf(), length(), substring(), append(), insert(), delete(), deleteCharAt(), and reverse() methods of the StringBuilder class.

package ProgrammingChallenge;

public class StringBuilderChallenge{
    public static void main(String[] args) {
        StringBuilder x = new StringBuilder("characters");

        int length = x.length();
        System.out.println(length);

        char initial = x.charAt(0);
        System.out.println(initial);

        String last = x.substring(9,10);
        System.out.println(last);

        int aOccurence = x.indexOf("a");
        System.out.println(aOccurence);

        String threeSix = x.substring(3,6);
        System.out.println(threeSix);
        
        StringBuilder append = x.append("123");
        System.out.println(append);

        StringBuilder insert = x.insert(4, "xyz");
        System.out.println(insert);

        StringBuilder delete1 = x.delete(2,4);
        System.out.println(delete1);

        StringBuilder delete2 = x.deleteCharAt(8);
        System.out.println(delete2);

        StringBuilder reverse = x.reverse();
        System.out.println(reverse);
    }
}