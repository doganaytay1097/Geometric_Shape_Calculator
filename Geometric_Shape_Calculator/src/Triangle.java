public class Triangle extends Shape {


    private int a, b, c;

    public Triangle(int a, int b, int c, String name) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public void calculateArea() {

        double u = (a + b + c) / 2;

        double area = Math.sqrt(u * (u - a) * (u - b) * (u - c)) ;

        System.out.println("The area of the "+ getName() +" is " + area);


    }
}
