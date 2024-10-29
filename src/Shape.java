public interface Shape {

    public void getAtributes();

}

class Circle implements Shape {
    private double radius;
    public double perimeter;
    public double area;

    public Circle(double radius) {
        this.radius = radius;
        perimeter = 2 * Math.PI * radius;
        area = Math.PI * radius * radius;
    }

    @Override
    public void getAtributes() {
        System.out.println("Radius: " + radius);
        System.out.println("Perimetr: " + perimeter);
        System.out.println("Perimetr: " + area);

    }

}

class Square implements Shape {
    private double length;
    private double perimeter;
    private double area;

    public Square(double length) {
        this.length = length;
        perimeter = 4 * length;
        area = length * length;
    }

    public void getAtributes() {
        System.out.println("Length: " + length);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}

class Rectangle implements Shape {
    private double height;
    private double width;
    private double perimeter;
    private double area;
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;

        perimeter = 2 * height * width;
        area = height * width;

    }

    public void getAtributes() {
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);

    }
}