public class Hockey extends Player {
    public Hockey(String name, int num, double salary, String sport) {
        super(name, num, salary, sport);
    }
    public void defend() {
        System.out.println(this.getName() + " defends the puck!");
    }
    public void goal() {
        System.out.println(this.getName() + " scores a goal!");
    }
    public void shoot() {
        System.out.println(this.getName() + " shoots the puck!");
    }
    public void pass() {
        System.out.println(this.getName() + " passes the puck!");
    }
}
