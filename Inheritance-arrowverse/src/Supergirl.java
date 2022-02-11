import java.util.Scanner;

public class Supergirl extends Flash{
    private String[] superpowers;

    public Supergirl(double reviewStars, int releaseMonth, int releaseDay, int releaseYear) {
        super(reviewStars, releaseMonth, releaseDay, releaseYear);
    }

    private void setSuperpowers() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of superpowers that " + this.getTeamLeader() + " has: ");
        int numSuperpowers = input.nextInt();
        input.nextLine();
        this.superpowers = new String[numSuperpowers];
        for (int i = 0; i < numSuperpowers; i++) {
            System.out.print("Enter " + (i + 1) + " superpower: ");
            this.superpowers[i] = "" + input.nextLine();
        }
    }

    private String[] getSuperpowers() {
        return this.superpowers;
    }

}
