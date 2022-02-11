public class Cone extends ThreeDShapes {
    public Cone(double radius, double height) {
        super(radius, height, 0, 0);
    }
    public double getSurfaceArea() {
        return (Math.PI * getRadius() * (getRadius() + Math.sqrt(Math.pow(getRadius(), 2) + Math.pow(getHeight(), 2))));
    }
    public double getVolume() {
        return (Math.PI * Math.pow(this.getRadius(), 2) * this.getHeight()) / 3;
    }
}
