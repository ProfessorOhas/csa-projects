public class ThreeDShapes implements Functions {
    private double radius;
    private double height;
    private double width;
    private double length;
    public ThreeDShapes(double radius, double height, double width, double length) {
        this.radius = radius;
        this.height = height;
        this.width = width;
        this.length = length;
    }
    public double getSurfaceArea() {
        return 0;
    }
    public double getVolume() {
        return 0;
    }
    public double getRadius() {
        return this.radius;
    }
    public double getHeight() {
        return this.height;
    }
    public double getWidth() {
        return this.width;
    }
    public double getLength() {
        return this.length;
    }
}
