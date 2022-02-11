public class IceHockey extends Hockey {
    public IceHockey(String name, int num, double salary) {
        super(name, num, salary, "Ice Hockey");
    }
    public void stickHandle() {
        System.out.println(this.getName() + " stickhandles the puck!");
    }
    public void skateForward() {
        System.out.println(this.getName() + " skates forward!");
    }
}
