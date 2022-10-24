/*
C5 = 1 -> C = Вт
C7 = 0 -> double
C11 = 5 -> Обчислити суму найбільших елементів
в рядках матриці з непарними номерами та найменших елементів
в рядках матриці з парними номерами
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
        double[][] numbers = new double[n][m] ;
        Random random = new Random();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                numbers[i][j] = random.nextDouble(1, 5);
            }
        }

        System.out.println("Початкова рандомно згенерована матриця");
        print(numbers);

        double[][] transpose = transpose(numbers);
        System.out.println("Транспонована матриця");
        print(transpose);



    }

    public  static double[][] transpose(double[][] matrix){
        int n = matrix.length;
        int  m = matrix[0].length;
        double[][] tr = new double[m][n];
        for(int i = 0; i < n; i++){
            for(int j =0; j < m; j++){
                tr[j][i] = matrix[i][j];
            }
        }
        return tr;
    }

    public static  void print(double[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
