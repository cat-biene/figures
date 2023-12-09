package figures;
//  Задать в программе три стороны треугольника.
//  Проверить выполнимость неравенства треугольника
//  - любая из сторон должна быть меньше суммы двух других.
//  Сообщить результат - существует или нет треугольник с заданными сторонами.

public class Triangle {

    public static void main(String[] args) {
        double a = 1;
        double b = 1;
        double c = 1;

        boolean result = notEqualSideTriangle(a, b, c);
        System.out.printf("a = " + a +
                " b = " + b +
                " c = " + c +
                " result " + result);
    }

    private static boolean notEqualSideTriangle(double a, double b, double c) {
            return a < b + c && b < a + c && c < a + b;
    }
}
