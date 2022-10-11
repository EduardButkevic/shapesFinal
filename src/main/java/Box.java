import java.util.ArrayList;

class Box extends Shape {
    private ArrayList<Shape> shapes = new ArrayList<>();
    private double boxVolume;

    public Box(double boxVolume) {
        super(boxVolume);
        this.boxVolume = boxVolume;
    }

    public boolean insertShape(Shape shape) {
        if (boxVolume >= shape.getVolume()) {
            shapes.add(shape);
            boxVolume = boxVolume - shape.getVolume();
            return true;
        } else {
            return false;
        }

    }
}