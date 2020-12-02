using System;

namespace Lab_6 {
    internal class Program {
        public static void Main(string[] args) {
            double eps = 0.00001, x1 = 0.818, x2 = 1.403, x3 = 3.141;
            double area = get_area_1(x1, x2, eps)+get_area_2(x2, x3, eps);
            Console.WriteLine(area);
        }
        
        private static double get_area_1(double x_min, double x_max, double eps) {
            double a, b, c, s1 = 0;
            for (double x = x_min; x <= x_max; x += eps) {
                a = Math.Log(1 + Math.Pow(x, 2));
                b = Math.Exp(-1 * Math.Pow(x, 2));
                c = (a - b) * eps;
                s1 += c;
            }
            return s1;
        }
        
        private static double get_area_2(double x_min, double x_max, double eps) {
            double a, b, c, s2 = 0;
            for (double x = x_min; x <= x_max; x += eps) {
                a = 2 / x * Math.Cos(x / 2);
                b = Math.Exp(-1 * Math.Pow(x, 2));
                c = (a - b) * eps;
                s2 += c;
            }
            return s2;
        }
    }
}
