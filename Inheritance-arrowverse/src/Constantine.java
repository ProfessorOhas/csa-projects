import java.util.Scanner;

public class Constantine extends Arrow{
    private String[] magicSpells;

    public Constantine(double reviewStars, int releaseMonth, int releaseDay, int releaseYear) {
        super(reviewStars, releaseMonth, releaseDay, releaseYear);
    }

    private void setMagicSpells() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of magic spells that " + this.getTeamLeader() +" has: ");
        int numSpells = input.nextInt();
        input.nextLine();
        this.magicSpells = new String[numSpells];
        for (int i = 0; i < numSpells; i++) {
            System.out.print("Enter " + (i + 1) + " spell: ");
            this.magicSpells[i] = input.nextLine();
        }
    }

    private String[] getMagicSpells() {
        return this.magicSpells;
    }

    public String toString() {
        return super.toString() + "\nMagic spells: " + this.getMagicSpells();
    }
}
