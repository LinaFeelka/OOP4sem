import java.util.Scanner;
public class lab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число A:");
        int a = scanner.nextInt();
        System.out.println("Введите число B:");
        int b = scanner.nextInt();
    
        System.out.println("Сумма чисел: " + sum(a, b));
        System.out.println("Сумма чисел + 10: " + sum(a, b, 10));
        if (isEven(a)) {
            printMessage("Число А четное.");
        } else {
            printMessage("Число А нечетное.");
        } 

        printMessage("Вывод метода printMessage!");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static boolean isEven (int number) {
        return number % 2 == 0;
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

}
