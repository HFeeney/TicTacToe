import java.util.Scanner;

public class TicTacToe {

    static String[] grid = new String[9];
    static String currentPlayer = "X";
    static boolean playing = true;

    public static void main(String[] args) throws Exception {


        printInstructions();
        while(playing) {
            display(grid);

            boolean updateBoardSuccessful = false;
            while (!updateBoardSuccessful) {
                int input = getIntInput() - 1;
                updateBoardSuccessful = updateBoard(input);
                if (!updateBoardSuccessful)
                    System.out.println("Space is already filled");
            }

            int gameState = checkState(grid);
            if (gameState == 1) {
                System.out.println("Someone win!");
                display(grid);
                playing = false;
            } else if (gameState == 2) {
                System.out.println("Tie...");
                display(grid);
                playing = false;
            }
        }
    }

    // prints out instructions to the user
    public static void printInstructions() {
        System.out.println(
            "Welcome to the game of TicTacToe! \nInput the space you would like to place a mark at. \nSpaces start at 1 in the top left, 2 is the top middle, etc.\nThe goal is to get three of your marks in a row\nPlayer X goes first");
    }

    // displays the tic tac toe board in the console
    public static void display(String[] spots) {
       for(int i = 0; i < spots.length; i++){
           if(spots[i] == null){
                spots[i] = " ";

           }
       }

       System.out.println(spots[0] + " | " + spots[1] + " | " + spots[2]);
        
       System.out.println("----------");

       System.out.println(spots[3] + " | " + spots[4] + " | " + spots[5]);
        
       System.out.println("----------");

       System.out.println(spots[6] + " | " + spots[7] + " | " + spots[8]);

       
        
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
            console.nextLine();
        }
        return result;
    }

    // update board at specific position, returns wheather its successful in updated or not
    public static boolean updateBoard(int position) {
        //0 is X's turn, 1 is O's turn
        if(currentPlayer.equals("O")) { // O's turn
            if(grid[position].equals(" ")) {//if the move happened
                currentPlayer = "X";
                grid[position] = "O"; 
                return true;
            }
        } else if (currentPlayer.equals("X")) { // X's turn
            if(grid[position].equals(" ")) { //if the move happened
                currentPlayer = "O";
                grid[position] = "X";
                return true;
            }
        }
        return false;
    }

    // returns whether the puzzle is neither filled nor solved (0), solved (1), or filled (2)
    public static int checkState(String[] board) {

        int counter = 0;

        for(int i = 0; i < 9; i++) {
            if(board[i].equals("X") || board[i].equals("O")) {
                counter++;
            }
        }

        if ((board[0].equals("X") && board[1].equals("X") && board[2].equals("X"))
        || (board[0].equals("O") && board[1].equals("O") && board[2].equals("O"))) {
            return 1;
        } else if ((board[3].equals("X") && board[4].equals("X") && board[5].equals("X"))
        || (board[3].equals("O") && board[4].equals("O") && board[5].equals("O"))) {
            return 1;
        } else if ((board[6].equals("X") && board[7].equals("X") && board[8].equals("X"))
        || (board[6].equals("O") && board[7].equals("O") && board[8].equals("O"))) {
            return 1;
        } else if ((board[0].equals("X") && board[3].equals("X") && board[6].equals("X"))
        || (board[0].equals("O") && board[3].equals("O") && board[6].equals("O"))) {
            return 1;
        } else if ((board[1].equals("X") && board[4].equals("X") && board[7].equals("X"))
        || (board[1].equals("O") && board[4].equals("O") && board[7].equals("O"))) {
            return 1;
        } else if ((board[2].equals("X") && board[5].equals("X") && board[8].equals("X"))
        || (board[2].equals("O") && board[5].equals("O") && board[8].equals("O"))) {
            return 1;
        } else if ((board[0].equals("X") && board[4].equals("X") && board[8].equals("X"))
        || (board[0].equals("O") && board[4].equals("O") && board[8].equals("O"))) {
            return 1;
        } else if ((board[2].equals("X") && board[4].equals("X") && board[6].equals("X"))
        || (board[2].equals("O") && board[4].equals("O") && board[6].equals("O"))) {
            return 1;
        } else if (counter >= 9) {
            return 2; 
        }

        return 0;
        
    }
}
