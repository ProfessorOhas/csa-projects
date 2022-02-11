public class RectPrisms extends Prisms {
    public RectPrisms(double height, double width, double length) {
        super(height, width, length);
    }
    public double getSurfaceArea() {
        return 2 * (this.getHeight() * this.getWidth() + this.getHeight() * this.getLength() + this.getWidth() * this.getLength());
    }
    public double getVolume() {
        return this.getHeight() * this.getWidth() * this.getLength();
    }
    
}
