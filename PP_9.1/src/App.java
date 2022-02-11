public class App {
    public static void main(String[] args) throws Exception {
        Spheres spheres = new Spheres(5);
        System.out.println(spheres.getSurfaceArea());
        System.out.println(spheres.getVolume());
        Cone cone = new Cone(1, 2);
        System.out.println(cone.getSurfaceArea());
        System.out.println(cone.getVolume());
        Cylinders cylinder = new Cylinders(1, 2);
        System.out.println(cylinder.getSurfaceArea());
        System.out.println(cylinder.getVolume());
        PentPrisms pentPrism = new PentPrisms(1, 2);
        System.out.println(pentPrism.getSurfaceArea());
        System.out.println(pentPrism.getVolume());
        RectPrisms rectprisms = new RectPrisms(1, 2, 3);
        System.out.println(rectprisms.getSurfaceArea());
        System.out.println(rectprisms.getVolume());
        Cube cubes = new Cube(1);
        System.out.println(cubes.getSurfaceArea());
        System.out.println(cubes.getVolume());
    }
}
