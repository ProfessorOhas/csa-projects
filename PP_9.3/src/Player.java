public class Player implements Information {
    private String name;
    private int number;
    private double salary;
    private String sport;
    public Player(String name, int number, double salary, String sport) {
        this.name = name;
        this.number = number;
        this.salary = salary;
        this.sport = sport;
    }
    public String getName() {
        return this.name;
    }
    public int getNumber() {
        return this.number;
    }
    public double getSalary() {
        return this.salary;
    }
    public String getSport() {
        return this.sport;
    }
}
