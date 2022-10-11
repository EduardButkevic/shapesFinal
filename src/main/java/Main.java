public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2, 2);
        Ball ball = new Ball(2.5);
        Pyramid pyramid = new Pyramid(50, 80);
        Box box = new Box(2000);

        System.out.println(box.insertShape(ball));
        System.out.println(box.insertShape(pyramid));
        System.out.println(box.insertShape(cylinder));
        System.out.println(box.insertShape(pyramid));
        System.out.println(box.insertShape(pyramid));
    }
}