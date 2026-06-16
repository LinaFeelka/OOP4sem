public class lab4 {
    public static void main(String[] args) {
        int numbers[] = {10, 25, 7, 42, 18};

        System.err.print("Элементы массива: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(" ");

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Сумма элементов: " + sum);

        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Наибольшее число: " + max);

        boolean has42 = false;
        for (int i =0; i < numbers.length; i++) {
            if (numbers[i] == 42) {
                has42 = true;
                break;
            } 
        }
        if (has42) {
            System.out.println("Массив содержит число 42");
        } else {
            System.out.println("Массив не содержит число 42");
        }

    }
}