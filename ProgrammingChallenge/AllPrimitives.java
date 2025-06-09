// Task2.java
// Create all of the primitives (except long and double)
// with different values. Concatenate them into a string and
// print it to the screen so it will print: H3110 w0r1d 2.0 true      
// byte zero = 0;
// String output = "W" + zero + "w";
// System.out.println(output);
// byte, short, int, float, char, boolean

package ProgrammingChallenge;

public class AllPrimitives{
    public static void main(String[] args) {
        char H = 'H';
        short three = 3;
        int oneonezero = 110;

        float twoPointzero = 2.0f;
        boolean True = true;

        byte zero = 0;
        String output = String.valueOf(H) + three + oneonezero + " w" + zero + "r1d " + twoPointzero + " " + True;
        System.out.println(output);
    }
}