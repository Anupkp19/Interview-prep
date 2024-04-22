package LLDTicTacToe;

public class Main {

    public static void main(String args[]) {
        LLDTicTacToe.TicTacToeGame game = new LLDTicTacToe.TicTacToeGame();
        game.initializeGame();
        System.out.println("game winner is: " + game.startGame());
    }
}
