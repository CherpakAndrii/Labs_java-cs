import java.lang.Math;

public class Main {
    static double area = 0;
    public static void main(String[] args) {
        double eps = 0.00001, x1 = 0.818, x2 = 1.403, x3 = 3.141, area = 0;
        get_area_1(x1, x2, eps);
        get_area_2(x2, x3, eps);
    }

    public static void get_area_1(double x_min, double x_max, double eps) {
        double a, b, c, s1 = 0;
        for (double x = x_min; x <= x_max; x += eps) {
            a = Math.log(1 + Math.pow(x, 2));
            b = Math.exp(-1 * Math.pow(x, 2));
            c = (a - b) * eps;
            s1 += c;
        }
        area += s1;
    }

    public static void get_area_2(double x_min, double x_max, double eps) {
        double a, b, c, s2 = 0;
        for (double x = x_min; x <= x_max; x += eps) {
            a = 2 / x * Math.cos(x / 2);
            b = Math.exp(-1 * Math.pow(x, 2));
            c = (a - b) * eps;
            s2 += c;
        }
        area += s2;
        System.out.print("The area of the figure limited by these functions: ");
        System.out.println(area);
    }
}
