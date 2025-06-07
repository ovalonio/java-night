// Multiplication Table 10x10

package ProgrammingChallenge;

public class MultiplicationTable {
    public static void main(String[] args) {
        new PrepareTable();
    }
}

class PrepareTable{
    public PrepareTable(){
        int row = 10;
        int w = 1;
        int y;

        for (int x = 1 ; x <= row ; x++){
            for (y = 1; y <= row ; y++, w += x){
                System.out.print(" " + w + " ");
            }
            w = x + 1;
            System.out.println();
        }
    }
}


