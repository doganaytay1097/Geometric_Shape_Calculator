public class Square extends Shape {

    private int edge;

    public Square(String name, int edge) {
        super(name);
        this.edge = edge;
    }


    @Override
    void calculateArea() {
        double area = edge * edge;

        System.out.println("The area of the " + getName() + " is: " + area);
    }
}
