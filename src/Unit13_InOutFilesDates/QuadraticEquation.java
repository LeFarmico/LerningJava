package Unit13_InOutFilesDates;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        int a, b, c;

        a = 4;
        b = -16;
        c = 1;

        quadraticEquation(a, b, c);
    }
    public static void quadraticEquation(int a, int b, int c){
        int d = (-b) - (4 * a * c);
        if (d > 0){
            double x1 = ((-b) + sqrt(d)) / 2 * a;
            double x2 = ((-b) - sqrt(d)) / 2 * a;
            System.out.println("x1 = " + x1 + " x2 = " + x2);
        }
        else if (d == 0){
            double x = -b / 2 * a;
            System.out.println("x = " + x);
        }
        else System.out.println("Корней нету");
    }
}
