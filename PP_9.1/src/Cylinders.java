public class Cylinders extends ThreeDShapes {
    public Cylinders(double radius, double height) {
        super(radius, height, 0, 0);
    }
    public double getSurfaceArea() {
        return (2 * (Math.PI * getRadius() * getHeight() + Math.PI * Math.pow(getRadius(), 2)));
    }
    public double getVolume() {
        return (Math.PI * Math.pow(this.getRadius(), 2) * this.getHeight());
    }
}
