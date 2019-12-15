import java.util.Random;
import java.util.Scanner;

public class Main {
    
    private final Random rand;
    private final int sides;

    public Main(int sides) {
        this.rand = new Random();
        this.sides = sides;
    }

    public int roll() {
        return 1 + rand.nextInt(sides);
    }
    public static void main(String []args)
    {

        Scanner input = new Scanner(System.in);
        int guess,x;


        System.out.println("Dice Rolling Guessing Game\n");

        System.out.println("How many sides does the dice have?");
        Main dice = new Main(input.nextInt());
        System.out.println("What is your guess for this roll");
        guess = input.nextInt();
        x=dice.roll();
        System.out.println("\nThe dice rolled a " + x + ".");


        if (x == guess)
            System.out.println("YOU GUESSED CORRECTLY!");
        else
            System.out.println("tough luck champ.");

    }
}