//выводящий числа от 1 до 5 с задержкой 500 мс.
class NumberTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Число: " + i);
            try {
                Thread.sleep(500); // задержка 500 мс
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
}
}
//выводящий буквы от 'A' до 'E' с задержкой 700 мс.
class LetterTask implements Runnable {
    @Override
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Letter: " + c);
            try {
                Thread.sleep(700); // задержка 700 мс
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }    
}

public class lab14 {
    public static void main(String[] args) {
        //объекты задач
        Runnable numberTask = new NumberTask();
        Runnable letterTask = new LetterTask();

        //потоки
        Thread thread1 = new Thread(numberTask);
        Thread thread2 = new Thread(letterTask);

        //запуск потоков
        thread1.start();
        thread2.start();
    }
}

