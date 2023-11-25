
class Shape {
    String color;

    public void area() {
        System.out.println("display area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println("Area of triangle" + " " + 1 / 2 * l * h);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println("Area of circle" + " " + (3.14) * r * r);
    }
}

class Cube extends Shape {
    public void CurvedSurfaceArea(int r) {
        System.out.println("Curved surface area of cube " + " " + 4 * r * r);
    }
}

// class CurvedSurfaceArea extends

public class oopsInheritance {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.color = "Red";
        triangle.area(2, 3);
        Circle circle = new Circle();
        circle.area(4);
        Cube cube = new Cube();
        cube.CurvedSurfaceArea(7);
    }
}
