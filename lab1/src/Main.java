import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.pow;


public class Main {

    public static void main(String[] args) {
        System.out.println("Enter x=");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        if (abs(x) > 1) {
            System.out.println("x must be in [-1, 1]");
            return;
        }

        Solution solution = new Solution();
        System.out.printf(
                "Result: %f\nControl formula: %f\n",
                solution.calc(x),
                solution.control_formula(x)
        );

    }
}


class Solution {
    final double eps = 1e-13;

    public double calc(double x) {
        return java.util.stream.IntStream.iterate(1, i -> i + 1)
                .mapToDouble(i -> this.func(x, i))
                .takeWhile(val -> abs(val) > this.eps)
                .sum();
    }

    double func(double x, int i) {
        return this.upper_func(i) / this.bottom_func(i) * pow(x, i) * pow(-1, i - 1);
    }

    double upper_func(int i) {
        return java.util.stream.IntStream.iterate(i, n -> n > 0, n -> n - 1)
                .mapToDouble(n -> 4.0 * n - 3.0)
                .reduce(1.0, (a, b) -> a * b);
    }

    double bottom_func(int i) {
        return java.util.stream.IntStream.iterate(i, n -> n > 0, n -> n - 1)
                .mapToDouble(n -> 4.0 * n)
                .reduce(1.0, (a, b) -> a * b);
    }

    public double control_formula(double x) {
        return 1.0 - 1.0 / pow((1.0 + x), 1.0 / 4.0);
    }
}


