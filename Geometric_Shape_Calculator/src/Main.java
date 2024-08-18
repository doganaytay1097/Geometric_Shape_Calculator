import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String transactions = "Transactions \n"
                + "1. Square area calculator\n"
                + "2. Triangle area calculator\n"
                + "3. Circle area calculator\n"
                + "Q for EXIT";
        while (true){
            System.out.println(transactions);
            System.out.println("Enter your choice: ");
            String choice = sc.nextLine();
            Shape shape = null;
            if(choice.equals("Q") ){
                System.out.println("Goodbye!");
                break;
            } else if (choice.equals("1")) {
                System.out.println("Enter the amount of square: ");
                int square = sc.nextInt();
                sc.nextLine();
                shape = new Square("Square", square);

                shape.calculateArea();
            }else if(choice.equals("2")){
                System.out.println("Enter the amount of triangle: ");
                System.out.println("Edge 1");
                int triangle1 = sc.nextInt();

                System.out.println("Edge 2");
                int triangle2 = sc.nextInt();

                System.out.println("Edge 3");
                int triangle3 = sc.nextInt();
                sc.nextLine();

                shape = new Triangle(triangle1,triangle2,triangle3,"Triangle");

                shape.calculateArea();
            }else if(choice.equals("3")){
                System.out.println("Enter the amount of circle: ");
                int circle = sc.nextInt();
                sc.nextLine();
                shape = new Circle("Circle", circle);
                shape.calculateArea();
            }
            else {
                System.out.println("Invalid choice");
            }
        }

    }
}