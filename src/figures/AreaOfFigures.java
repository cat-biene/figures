package figures;

// Метод вычисляющий площадь круга;
// Метод вычисляющий площадь квадрата;
// Метод вычисляющий площадь прямоугольника (чуть сложнее чем 1. и 2.);
// В методе main вызвать вышеуказанные методы с различными аргументами,
// и результаты вывести в консоль.
//  Написать приложение, которое вычисляет объем куба по длине его ребра 
//  и площадь его поверхности.
// Написать приложение, которое вычисляет площадь треугольника по его основанию и высоте.

public class AreaOfFigures {

    public static void main(String[] args) {

        areaOfCircle(3.14, 5.0);
        areaOfSquare(5.0);
        areaOfRectangle(2.5,4.5);
        areaOfTriangle(3.5,6.0);
        volumeOfCube(4);
        areaOfCube(5.5);
    }

    private static void areaOfCube(double a) {
        double s = 6 * a * a;
        System.out.printf("Area of cube = %.2f", s);
        System.out.println();
    }

    private static void volumeOfCube(double a) {
        double v = a * a * a;
        System.out.printf("Volume of cube = %.2f", v);
        System.out.println();
    }

    private static void areaOfTriangle(double a, double h) {
        double s = a * h / 2;
        System.out.printf("Area of triangle = %.2f", s);
        System.out.println();
    }

    private static void areaOfRectangle(double a, double b) {
        double s = a * b;
        System.out.printf("Area of rectangle = %.2f", s);
        System.out.println();
    }

    private static void areaOfSquare(double a) {
        double s = a * a;
        System.out.printf("Area of square = %.2f", s);
        System.out.println();
    }

    private static void areaOfCircle(double pi, double r) {
        double s = pi * r * r;
        System.out.printf("Area of circle = %.2f", s);
        System.out.println();
    }
}
