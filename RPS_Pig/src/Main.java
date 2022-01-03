import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] choices = { "rock", "paper", "scissor" };
        Boolean loop = true;
        while (loop) {
            RPS(choices);
            System.out.print("Do you want to play again, type true or false: ");
            loop = input.nextBoolean();
        }
        Compare2();
        Pig();
    }

    public static void RPS(String[] choices) {
        Scanner console = new Scanner(System.in);
        Random machine = new Random();
        System.out.print("Choose rock, paper, or scissors (type out whole choice): ");
        String PlayerChoice = console.nextLine();
        int CompNumberChoice = machine.nextInt(3);
        String CompChoice = choices[CompNumberChoice];
        System.out.println("Player chose " + PlayerChoice + "\nComputer chose " + CompChoice);
        CheckWinner(PlayerChoice, CompChoice);
    }

    public static void CheckWinner(String player, String computer) {
        if (player.equals(computer)) {
            System.out.println("Its a tie!");
        } else if (player.equals("rock") && computer.equals("scissor")) {
            System.out.println("Player won!");
        } else if (player.equals("paper") && computer.equals("rock")) {
            System.out.println("Player won!");
        } else if (player.equals("scissor") && computer.equals("paper")) {
            System.out.println("Player won!");
        } else {
            System.out.println("Computer won!");
        }
    }

    public static void Compare2() {
        String Player1Name = "";
        double Player1Stats = 0;
        String Player2Name = "";
        double Player2Stats = 0;
        int Player1Moves = 0;
        int Player2Moves = 0;
        for (int i = 1; i <= 2; i++) {
            Scanner console = new Scanner(System.in);
            System.out.print("Name: ");
            String name = console.nextLine();
            System.out.print("Enter number of times you have played Rock Paper Scissors: ");
            int PlayedNumber = console.nextInt();
            System.out.print("Enter number of times you have won the game: ");
            int WonNumber = console.nextInt();
            for (int j = 1; j <= PlayedNumber; j++) {
                System.out.println("Enter number of moves for game " + j);
                int temp = console.nextInt();
                if (i == 1) {
                    Player1Moves += temp;
                } else {
                    Player2Moves += temp;
                }
            }
            if (i == 1) {
                Player1Name = name;
                Player1Stats = WonNumber / PlayedNumber;
            } else {
                Player2Name = name;
                Player2Stats = WonNumber / PlayedNumber;
            }
        }
        if (Player1Stats > Player2Stats) {
            System.out.println(Player1Name + " is better!");
        } else if (Player1Stats < Player2Stats) {
            System.out.println(Player2Name + " is better!");
        } else {
            if (Player1Moves < Player2Moves) {
                System.out.println(Player1Name + " is better!");
            } else {
                System.out.println(Player2Name + "is better!");
            }
        }
    }

    public static void Pig() {
        Scanner console = new Scanner(System.in);
        System.out.println(
                "Welcome to the 2-player game Pig. \nPig is a game where a player rolls a dice repeatedly until he/she wishes to stop. \nThe objective of the game is to reach a 100 points overall. \nIf your dice lands one a 1, your score is reset.");
        System.out.print("First player name: ");
        String FirstPlayerName = console.nextLine();
        System.out.print("Second player name: ");
        String SecondPlayerName = console.nextLine();
        int FirstPlayerScore = 0;
        int SecondPlayerScore = 0;
        while (FirstPlayerScore < 100 || SecondPlayerScore < 100) {
            int temp1 = Turn(FirstPlayerName, FirstPlayerScore);
            int temp2 = Turn(SecondPlayerName, SecondPlayerScore);
            FirstPlayerScore += temp1;
            SecondPlayerScore += temp2;
        }
        if (FirstPlayerScore > 100) {
            System.out.println(FirstPlayerScore + "won and scored " + FirstPlayerScore + "points");
        } else {
            System.out.println(SecondPlayerName + "won and scored " + SecondPlayerScore + "points");
        }
    }

    public static int Turn(String Name, int Score) {
        Scanner console = new Scanner(System.in);
        Random dice = new Random();
        Boolean repeat = true;
        while (repeat) {
            System.out.println(Name + "'s turn");
            int DiceRoll = dice.nextInt(6) + 1;
            System.out.println(Name + " rolled a " + DiceRoll);
            if (DiceRoll == 1) {
                Score = 0;
            } else {
                Score += DiceRoll;
            }
            System.out.println(Name + "'s total score is " + Score);
            System.out.print("Do you want to roll again, " + Name + " (enter true or false): ");
            repeat = console.nextBoolean();
        }
        return Score;
    }
}
