public abstract class Shape {

    private String name;

    public Shape(String name) {
        this.name = name;
    }

    abstract void calculateArea();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
