public class Tennis extends Player {
    public Tennis(String name, int num, double salary) {
        super(name, num, salary, "Tennis");
    }
    public void runToNet() {
        System.out.println(this.getName() + " runs to the net!");
    }
    public void smash() {
        System.out.println(this.getName() + " smashes the ball!");
    }
    public void forehand() {
        System.out.println(this.getName() + " forehands the ball!");
    }
    public void backhand() {
        System.out.println(this.getName() + " backhands the ball!");
    }
    public void score() {
        System.out.println(this.getName() + " scores!");
    }
}
