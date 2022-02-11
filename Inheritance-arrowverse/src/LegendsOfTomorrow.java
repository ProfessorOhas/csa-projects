import java.util.Scanner;

public class LegendsOfTomorrow extends Arrow {
    private String[] specialties;

    public LegendsOfTomorrow(double reviewStars, int releaseMonth, int releaseDay, int releaseYear) {
        super(reviewStars, releaseMonth, releaseDay, releaseYear);
    }

    private void setSpecialties() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < this.getTeamMembers().length; i++) {
            System.out.print("Enter " + this.getTeamMembers()[i] + "'s specialty: ");
            this.specialties[i] = "" + input.nextLine();
        }
    }

    private String[] getSpecialties() {
        return this.specialties;
    }

    public void setMembers() {
        super.setMembers();
        this.specialties = new String[this.getTeamMembers().length];
        this.setSpecialties();
    }
}
