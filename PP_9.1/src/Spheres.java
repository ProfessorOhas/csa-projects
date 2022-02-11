public class Spheres extends ThreeDShapes {
    public Spheres(double radius) {
        super(radius, 0, 0, 0);
    }
    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(getRadius(), 2);
    }
    public double getVolume() {
        return 1.33333333333 * Math.PI * Math.pow(getRadius(), 3);
    }
}
