import java.util.Scanner;

public class Arrow {
    private String teamLeader;
    private String[] members;
    private String[] memberWeapons;
    private String mainWeapon;
    private int[] releaseDate = new int[3];
    private double reviewStars;
    private String[] arrows;

    public Arrow(double reviewStars, int releaseMonth, int releaseDay, int releaseYear) {
        this.reviewStars = reviewStars;
        this.releaseDate[0] = releaseMonth; this.releaseDate[1] = releaseDay; this.releaseDate[2] = releaseYear;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter team leader: "); this.teamLeader = input.nextLine();
        System.out.print("Enter " + this.teamLeader + "'s weapon: "); this.mainWeapon = input.nextLine();
    }

    public void setMembers() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of members: "); int numMembers = input.nextInt(); input.nextLine();
        this.members = new String[numMembers]; this.memberWeapons = new String[numMembers];
        for (int i = 0; i < numMembers; i++) {
            System.out.print("Enter " + (i + 1) + " member's name: "); this.members[i] = "" + input.nextLine();
        }
    }

    public void setMemberWeapons() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < this.members.length; i++) {
            System.out.print("Enter " + this.members[i] + "'s weapon: "); this.memberWeapons[i] = "" + input.nextLine();
        }
    }

    private void setArrows() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of different types of arrows: "); int numArrows = input.nextInt(); input.nextLine();
        this.arrows = new String[numArrows];
        for (int i = 0; i < numArrows; i++) {
            System.out.print("Enter " + (i + 1) + " type of arrow: ");
            this.arrows[i] = "" + input.nextLine();
        }
    }

    public String[] getTeamMembers() {
        return this.members;
    }

    public String[] getMemberWeapons() {
        return this.memberWeapons;
    }

    public String getTeamLeader() {
        return this.teamLeader;
    }

    public String getMainWeapon() {
        return this.mainWeapon;
    }

    public int[] getReleaseDate() {
        return this.releaseDate;
    }

    public double getReviewStars() {
        return this.reviewStars;
    }

    private String[] getArrows() {
        return this.arrows;
    }
}
