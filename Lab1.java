import java.util.Scanner;
/*
Лабораторна робота 1
Ступак Альона
група ІО-01
залікова книжка №126
Варіант:
О1 +
C = 0
О2 /
i, j byte
 */

public class Lab1 {
    static int C = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte a, b, n, m;
        for (; ; ) {
            System.out.println("Введіть дані:");
            System.out.println("a:");
            a = scanner.nextByte();
            System.out.println("b:");
            b = scanner.nextByte();
            System.out.println("n:");
            n = scanner.nextByte();
            System.out.println("m:");
            m = scanner.nextByte();
            System.out.println(a);
            // Перевірка ділення на 0:
            if ((a <= -C && n >= -C) || (b <= 0 && m >= 0)) {
                System.out.println("Некоректний діапазон.Ділення на 0");
            } else {
                float result = func(a, b, n, m);
                System.out.println("Результат: " + result);
                break;
            }
        }
    }

    public static float func(byte a, byte b, byte n, byte m) {
        float result = 0;
        for (byte i = a; i <= n; i++) {
            for (byte j = b; j <= m; j++) {
                result = result + (((i / (float) j) / (i + C)));
            }
        }
        return result;
    }

}
