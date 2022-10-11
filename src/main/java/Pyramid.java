class Pyramid extends Shape {
    private double square;
    private double height;

    public Pyramid(double square, double height) {
        super(0.33 * square * height);
        this.square = square;
        this.height = height;
    }
}