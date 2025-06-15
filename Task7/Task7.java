package Task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Arithmetic add = (x, y) -> x + y;
        Arithmetic sub = (x, y) -> x - y;
        Arithmetic mul = (x, y) -> x * y;
        Arithmetic div = (x, y) -> x / y;

        Scanner sc = new Scanner(System.in);

        System.out.println("Type a number:"); 
        int in1 = sc.nextInt(); 
        int in2 = sc.nextInt();

        try{
            int w = add.numbers(in1, in2);
            int x = sub.numbers(in1, in2);
            int y = mul.numbers(in1, in2);
            double z = div.numbers(in1, in2);

            System.out.println(in1 + " + " + in2 + " = " + w);
            System.out.println(in1 + " - " + in2 + " = " + x);
            System.out.println(in1 + " * " + in2 + " = " + y);
            System.out.println(in1 + " / " + in2 + " = " + z);

        }catch (ArithmeticException e){
            System.out.println(e.getClass().getSimpleName() + " " +e.getMessage());
        }

        sc.close();
    }
}

interface Arithmetic{
    int numbers(int x, int y);
}