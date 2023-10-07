import java.util.Scanner;

class Player {
    int numGuess;

    public void guessNumber(int i) {
        Scanner sc = new Scanner(System.in);
        System.out.println("player " + i + " please Guess the number");
        numGuess = sc.nextInt();
    }

}

class Guesser {
    int numGuess;

    public void guessNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number");
        numGuess = (int) (Math.random() * 10);
        System.out.println(numGuess);
    }

}

class Umpire {
    static Guesser guesser;
    Player p1, p2, p3;

    public void getNumberFromGuesser() {
        guesser = new Guesser();
        guesser.guessNumber();

    }

    public void collectFromPlayer() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        p1.guessNumber(1);
        p2.guessNumber(2);
        p3.guessNumber(3);

    }

    public void calcResult() {
        System.out.println(guesser.numGuess + " " + p1.numGuess + " " + p2.numGuess + " " + p3.numGuess);
        if (guesser.numGuess == p1.numGuess) {
            if (guesser.numGuess == p2.numGuess && guesser.numGuess == p3.numGuess) {
                System.out.println("All are winners");
            } else if (guesser.numGuess == p2.numGuess) {
                System.out.println("Player 1 and player 2 are winners");
            } else if (guesser.numGuess == p3.numGuess) {
                System.out.println("Player 1 and player 3 are winners");
            } else {
                System.out.println("Player 1 is the winner");
            }
        } else if (guesser.numGuess == p2.numGuess) {
            if (guesser.numGuess == p3.numGuess) {
                System.out.println("Player 2 and Player 3 are winners");
            } else {
                System.out.println("Player 2 is the winner");
            }
        } else if (guesser.numGuess == p3.numGuess) {
            System.out.println("Player 3 is winner");
        } else {
            System.out.println("Better luch next time");
        }

    }

}

public class LaunchGame {
    public static void main(String[] args) {
        Umpire umpire = new Umpire();
        umpire.getNumberFromGuesser();
        umpire.collectFromPlayer();
        umpire.calcResult();
    }

}
