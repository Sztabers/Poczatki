import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        System.out.print("Hello! How many stars would you like ? : ");
        Scanner input = new Scanner(System.in);
        int numOfStars = input.nextInt();


        for (int i= 1; i <= numOfStars; i++){
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = numOfStars; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
