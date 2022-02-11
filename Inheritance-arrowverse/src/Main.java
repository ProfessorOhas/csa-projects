public class Main {
    public static void main(String[] args) {
        Arrow Arrow = new Arrow(4.7, 10, 10, 2012);
        Constantine Constantine = new Constantine(4.8, 10, 24, 2014);
        Flash Flash = new Flash(4.6, 10, 7, 2014);
        Supergirl Supergirl = new Supergirl(4.2, 6, 8, 2015);
        Batwoman Batwoman = new Batwoman(2.7, 10, 6, 2019);
        Vixen Vixen = new Vixen(4.4, 8, 25, 2015);
        LegendsOfTomorrow LegendsOfTomorrow = new LegendsOfTomorrow(4.4, 1, 21, 2016);
        // call overriden method
        LegendsOfTomorrow.setMembers();
    }
}
