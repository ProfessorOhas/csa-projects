import java.util.Scanner;

public class Vixen extends Arrow{
    private String[] animals;

    public Vixen(double reviewStars, int releaseMonth, int releaseDay, int releaseYear) {
        super(reviewStars, releaseMonth, releaseDay, releaseYear);
    }

    private void setAnimalsShapeShifting() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of animals that " + this.getTeamLeader() +" can turn into: ");
        int numAnimals = input.nextInt();
        input.nextLine();
        this.animals = new String[numAnimals];
        for (int i = 0; i < numAnimals; i++) {
            System.out.print("Enter " + (i + 1) + " animal: ");
            this.animals[i] = input.nextLine();
        }
    }

    private String[] getAnimalsShapeShifting() {
        return this.animals;
    }


}
