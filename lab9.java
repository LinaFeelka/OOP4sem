import java.util.InputMismatchException;
import java.util.Scanner;


public class lab9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите число A:");
            int a = scanner.nextInt();
            System.out.println("Введите число B:");
            int b = scanner.nextInt();

            int res;
            res = a / b;

            System.out.println("Ответ: " + res);

        } catch (InputMismatchException e) { //если введено не число
            System.out.println("Введено не число.");
        } catch (ArithmeticException e) { //если делитель равен нулю
            System.out.println("На ноль делить нельзя.");
        } finally { //выполняется всегда
            System.out.println("Программа завершена");
        }

        scanner.close();
    }
}
