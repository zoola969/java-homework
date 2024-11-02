import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


// For an array of 2 columns and 10 rows, print the number of each row, both elements of which have zero values,
// and the number of such rows
public class Main {
    public static void main(String[] args) {
        int[][] arr = generateArray(10, 2);
        System.out.printf("Generated array: %s\n", Arrays.deepToString(arr));
        ArrayList<Integer> rows = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == 0 && arr[i][1] == 0) {
                rows.add(i);
            }
        }
        System.out.printf("Rows: %s, Number of rows: %d\n", rows, rows.size());
    }

    static int[][] generateArray(int rows, int cols) {
        int[][] arr = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = random.nextInt(3);
            }
        }
        return arr;
    }
}