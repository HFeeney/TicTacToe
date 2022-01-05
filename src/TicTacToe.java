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
