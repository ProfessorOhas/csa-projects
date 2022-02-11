import java.util.Scanner;

public class Flash extends Arrow{
    private String[] attacks;

    public Flash(double reviewStars, int releaseMonth, int releaseDay, int releaseYear) {
        super(reviewStars, releaseMonth, releaseDay, releaseYear);
    }

    public void setAttacks() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of different types of attacks that " + this.getTeamLeader() + " has: ");
        int numAttacks = input.nextInt();
        input.nextLine();
        this.attacks = new String[numAttacks];
        for (int i = 0; i < numAttacks; i++) {
            System.out.print("Enter " + (i + 1) + " attack: ");
            this.attacks[i] = "" + input.nextLine();
        }
    }

    public String[] getAttacks() {
        return this.attacks;
    }
}
