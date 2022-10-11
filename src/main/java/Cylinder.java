class Cylinder extends SolidOfRevolution {
    private double height;

    public Cylinder(double radius, double height) {
        super(Math.PI * Math.pow(radius, 3), radius);
        this.height = height;
    }
}