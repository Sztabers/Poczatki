
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {


        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}
        };


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your placement 1-9: ");
        int pos = scan.nextInt();

        placePiece(gameBoard, "player", pos);

        printGameBoard(gameBoard);

    }

    private static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    private static void placePiece(char[][] gameBoard, String user, int pos) {

        char symbol = ' ';

        if (user.equals("player")) {
            symbol = 'X';
        } else if (user.equals("cpu")) {
            symbol = 'O';
        }

        switch(pos) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }

    }

}


