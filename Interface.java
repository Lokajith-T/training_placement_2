interface Shape {
    void area();
}

class Circle implements Shape {
    public void area() {
        double r = 5;
        System.out.println("Area: " + (3.14 * r * r));
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.area();
    }
}
