public class Circle extends Shape{

    private double radius;

    private final double PI = 3.14;

    public Circle(String name,double radius) {
        super(name);
        this.radius = radius;
    }


    @Override
    void calculateArea() {

        double area = PI * radius * radius;

        System.out.println("The area of the "+ getName() + " is " + area);

    }
}
