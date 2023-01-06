/*
C5 = 1 -> C = Вт
C7 = 0 -> double
C11 = 5 -> Обчислити суму найбільших елементів
в рядках матриці з непарними номерами та найменших елементів
в рядках матриці з парними номерами
(рахую з 1)
 */

import java.util.Random;
import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        System.out.println("Введіть n:");
        n = scanner.nextInt();
        System.out.println("Введіть m:");
        m = scanner.nextInt();
        double[][] numbers = new double[n][m];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                numbers[i][j] = random.nextDouble(1, 5);
            }
        }

        System.out.println("Початкова рандомно згенерована матриця");
        print(numbers);

        double[][] transpose = transpose(numbers);
        System.out.println("Транспонована матриця");
        print(transpose);
        double[] min = new double[m / 2];
        double[] max = new double[m / 2 + m % 2];
        int k = 0;
        int p = 0;
        for (int i = 1; i <= m; i++) {
            if (i % 2 == 0) {
                min[k] = min(transpose[i - 1]);
                k++;
            } else {
                max[p] = max(transpose[i - 1]);
                p++;
            }
        }
        System.out.println("Масив найменших чисел в парних рядках");
        print(min);
        System.out.println("Його сума: " + sum(min));
        System.out.println("Масив найбільших чисел в непарних рядках");
        print(max);
        System.out.println("Його сума: " + sum(max));

    }

    public static double[][] transpose(double[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        double[][] tr = new double[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tr[j][i] = matrix[i][j];
            }
        }
        return tr;
    }

    public static void print(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double sum(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void print(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static double max(double[] matrix) {
        double max = matrix[0];
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i] > max) {
                max = matrix[i];
            }
        }
        return max;
    }

    public static double min(double[] matrix) {
        double min = matrix[0];
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i] < min) {
                min = matrix[i];
            }
        }
        return min;
    }
}
