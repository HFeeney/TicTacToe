import java.util.Scanner;

public class TicTacToe {

    static String[] grid = new String[9];
    static String currentPlayer = "X";
    static boolean playing = true;

    public static void main(String[] args) throws Exception {



        System.out.println("Hello, World!");
    }

    // prints out instructions to the user
    public static void printInstructions() {
        System.out.println(
            "Welcome to the game of TicTacToe! \nInput the space you would like to place a mark at. \nSpaces start at 1 in the top left, 2 is the top middle, etc.\nThe goal is to get three of your marks in a row\nPlayer X goes first");
    }

    // displays the tic tac toe board in the console
    public static void display() {

    }

    // returns a number input by the user
    public static int getIntInput() {
        Scanner console = new Scanner(System.in);
        int result = -1;
        while (console.hasNext()) {
            if (console.hasNextInt()) {
                result = console.nextInt();
                if (result >= 1 && result <= 9)
                    break;
            }
            else System.out.println("Please input a number between 1 - 9");
            console.nextLine();
        }
        console.close();
        return result;
    }

    // update board at specific position
    public static boolean updateBoard(int position) {

        return false;
    }

    // returns whether the puzzle is neither filled nor solved (0), solved (1), or filled (2)
    public static int checkState() {

        return 0;
    }
}
