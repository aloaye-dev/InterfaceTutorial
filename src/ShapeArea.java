import java.util.Scanner;

public class ShapeArea implements Area{
    public void Square(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the sides of the square");
        double s = scanner.nextInt();
        double areaOfSquare = s * s;
        System.out.println("Area of a square is :" + areaOfSquare);
    }

    @Override
    public void Rectangle() {
        System.out.println("I am a rectangle");
    }

    @Override
    public void circle() {
        System.out.println("I am a circle");
    }

    @Override
    public void oval() {
        System.out.println("I am an oval");
    }
    public static void main (String[] args){
        ShapeArea geometry = new ShapeArea();
        geometry.Square();
    }
}
