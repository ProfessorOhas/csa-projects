public class FieldHockey extends Hockey {
    public FieldHockey(String name, int num, double salary) {
        super(name, num, salary, "Field Hockey");
    }
    public void runForward() {
        System.out.println(this.getName() + " runs forward!");
    }
}
