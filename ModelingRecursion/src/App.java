public class App {
    public static void main(String[] args) throws Exception {
        recursion(99);
    }

    public static void recursion(int d) {
        if (d <= 1) {
            System.out.print(d);
        }
        else {
            if (d % 3 == 0) {
                recursion((int) d/3);
            }
            else {
                recursion((int) d/2);
            }
            System.out.print(", " + d);
        }
    }
}