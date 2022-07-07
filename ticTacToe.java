import static java.lang.System.out;
import java.util.Scanner;

public class ticTacToe {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x, y;

        String board[][] = {{" ", " ", " "},
                            {" ", " ", " "},
                            {" ", " ", " "}};

        while(true) {
            // Displays string board with a for loop
            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    out.print( board[i][j] + " : ");
                }
                out.println();
            }

            out.print("Player 1: Enter Position > ");
            x = input.nextInt();
            y= input.nextInt();

            board[x][y] = "X"; // This assign player 1 as "X"

            // Displays board again.
            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    out.print( board[i][j] + " : ");
                }
                out.println();
            }

            out.print("Player 2: Enter Position > ");
            x = input.nextInt();
            y= input.nextInt();

            board[x][y] = "O"; // This assign player 1 as "O"

        }
    }
}