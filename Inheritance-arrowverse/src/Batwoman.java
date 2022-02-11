import java.util.Scanner;

public class Batwoman extends Flash{
    private String[] accessories;

    public Batwoman(double reviewStars, int releaseMonth, int releaseDay, int releaseYear) {
        super(reviewStars, releaseMonth, releaseDay, releaseYear);
    }

    private void setAccessories() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of different types of accessories that " + this.getTeamLeader() + " has: ");
        int numAccessories = input.nextInt();
        input.nextLine();
        this.accessories = new String[numAccessories];
        for (int i = 0; i < numAccessories; i++) {
            System.out.print("Enter " + (i + 1) + " accessory: ");
            this.accessories[i] = "" + input.nextLine();
        }
    }

    private String[] getAccessories() {
        return this.accessories;
    }
}
