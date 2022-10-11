class Ball extends SolidOfRevolution {

    public Ball(double radius) {
        super(4.0 / 3.0 * Math.pow(radius, 3) * Math.PI, radius);
    }
}

