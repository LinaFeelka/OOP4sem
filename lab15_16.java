import java.util.Random;

public class lab15_16 {
    public static void main(String[] args) {
        //одномерный массив
        int[] oneDimensional = new int[10];
        Random random = new Random();

        //заполнение массива случайными числами
        for (int i = 0; i < oneDimensional.length; i++) {
            oneDimensional[i] = random.nextInt(100);
        }

        //вывод массива
        System.out.println("Одномерный массив:");
        for (int num : oneDimensional) {
            System.out.print(num + " ");
        }

        int max = oneDimensional[0];
        int min = oneDimensional[0];

        for (int num : oneDimensional) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

         System.out.println("\nМаксимальный элемент: " + max);
         System.out.println("Минимальный элемент: " + min);


        //двумерный массив, квадратная матрица
        int[][] twoDimensional = new int[3][3];

        //заполнение матрицы
        for (int i = 0; i < twoDimensional.length; i++) {
            for (int j = 0; j < twoDimensional.length; j++) {
                if (i == j) { //главная диагональ i=j
                    twoDimensional[i][j] = 1;
                } else {//остальные ячейки
                    twoDimensional[i][j] = 0;
                }
            }
        }
        //вывод матрицы
        System.out.println("Квадратная матрица:");
        for (int i = 0; i < twoDimensional.length; i++) {
            for (int j = 0; j < twoDimensional.length; j++) {
                System.out.print(twoDimensional[i][j] + " ");
            }
        }

        //ступенчатый массив, треугольник паскаля
        int[][] pascalTriangle = new int[5][5];
        for (int i = 0; i < pascalTriangle.length; i++) {
            pascalTriangle[i] = new int[i + 1];
            pascalTriangle[i][0] = 1;
            pascalTriangle[i][i] = 1;

            for (int j = 1; j < i; j++) {
                pascalTriangle[i][j] = pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j];
            }
        }
        //вывод треугольника
        System.out.println("\nТреугольник Паскаля:");
        for (int i = 0; i < pascalTriangle.length; i++) {
            //пробелы для форматирования
            for (int k = 0; k < pascalTriangle.length - i - 1; k++) {
                System.out.print(" ");
            }
            for (int num : pascalTriangle[i]) {
                System.out.print(num + " ");
            }
            System.out.println();
        }


    }
}
