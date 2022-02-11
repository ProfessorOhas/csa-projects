public class PentPrisms extends Prisms {
    public PentPrisms(double height, double length) {
        super(height, 0, length);
    }
    public double getSurfaceArea() {
        return (5 * getHeight() * getLength()) + (0.5 * Math.pow(getLength(), 2) * (Math.sqrt(5 * (5 + (2 * Math.sqrt(5))))));
    }
    public double getVolume() {
        return (Math.pow(getLength(), 2) * getHeight() * 0.25 * (Math.sqrt(5*(5 + (2 * Math.sqrt(5))))));
    }
}
