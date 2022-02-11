public class Football extends Player {
    public Football(String name, int num, double salary) {
        super(name, num, salary, "Football");
    }
    public void punt() {
        System.out.println(this.getName() + " punts the ball!");
    }
    public void runsToTheSide() {
        System.out.println(this.getName() + " runs to the side!");
    }
    public void Throw() {
        System.out.println(this.getName() + " throws the ball!");
    }
    public void Catch() {
        System.out.println(this.getName() + " catches the ball!");
    }
    public void touchdown() {
        System.out.println(this.getName() + " scores a touchdown!");
    }
}
