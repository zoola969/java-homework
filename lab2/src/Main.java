import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.lang.Math.abs;

// Find the sum and the total number of elements of the given array
// X1, X2, …, Xn, the absolute value of which differs from P by no more
// than T
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter target value=");
        double target = scanner.nextDouble();
        System.out.println("Enter delta=");
        double delta = scanner.nextDouble();
        System.out.println("Enter separated array size=");
        int size = scanner.nextInt();
        Solution solution = new Solution();
        solution.find(generateArray(size), target, delta);
    }

    static double[] generateArray(int size) {
        double[] arr = IntStream.range(0, size).mapToDouble(_ -> Math.random() * 100).toArray();
        System.out.printf("Generated array: %s\n", Arrays.toString(arr));
        return arr;
    }

}


class Solution {

    public void find(double[] arr, double target, double delta) {
        double sum = 0;
        int count = 0;
        for (double val : arr) {
            if (abs(val - target) <= delta) {
                sum += val;
                count++;
            }
        }
        System.out.printf("Sum: %f\nCount: %d\n", sum, count);
    }
}