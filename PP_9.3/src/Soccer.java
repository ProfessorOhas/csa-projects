public class Soccer extends Player {
    public Soccer(String name, int num, double salary) {
        super(name, num, salary, "Soccer");
    }
    public void passBall() {
        System.out.println(this.getName() + " passes the ball!");
    }
    public void shoot() {
        System.out.println(this.getName() + " shoots the ball!");
    }
    public void dribble() {
        System.out.println(this.getName() + " dribbles the ball!");
    }
    public void tackle() {
        System.out.println(this.getName() + " tackles the ball!");
    }
    public void block() {
        System.out.println(this.getName() + " blocks the shot!");
    }
}
