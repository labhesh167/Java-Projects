
import java.util.Scanner;

class Player
{
    int numGuess;
    public void guessNumber()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("player please Guess the number");
        numGuess = sc.nextInt();
    }

}
class Guesser
{
    int numGuess;
    public void guessNumber() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number");
        numGuess = sc.nextInt();
    }
    
}
class Umpire
{
    static Guesser guesser;
    Player p1,p2,p3;
    public static void getNumberFromGuesser()
    {
    guesser = new Guesser();
    guesser.guessNumber();

    }

    public void collectFromPlayer() 
    {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        p1.guessNumber();
        p2.guessNumber();
        p3.guessNumber();
        
    }

    public void calcResult() 
    {
        System.out.println(guesser.numGuess + " " + p1.numGuess + " " + p2.numGuess + " " + p3.numGuess);
        if(guesser.numGuess == p1.numGuess)
        {
            if(guesser.numGuess == p2.numGuess && guesser.numGuess == p3.numGuess)
            {
                System.out.println("All are winners");
            }
            else if(guesser.numGuess == p2.numGuess)
            {
                System.out.println("Player 1 and player 2 are winners");
            }
            else if(guesser.numGuess == p3.numGuess)
            {
                System.out.println("Player 1 and player 3 are winners");
            }
            else
            {
                System.out.println("Player 1 is the winner");
            }
        }
        else if(guesser.numGuess == p2.numGuess)
        {
            if(guesser.numGuess == p3.numGuess)
            {
             System.out.println("Player 2 and Player 3 are winners");
            }
            else
            {
                System.out.println("Player 2 is the winner");
            }
        }
        else if(guesser.numGuess == p3.numGuess)
        {
            System.out.println("Player 3 is winner");
        }
        else
        {
            System.out.println("Better luch next time");
        } 

    }

}


public class LaunchGame 
{
    public static void main(String[] args)
    {

        Umpire umpire = new Umpire();
        umpire.getNumberFromGuesser();
        umpire.collectFromPlayer();
        umpire.calcResult();
    }    

}
