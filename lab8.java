import java.util.ArrayList;
import java.util.Collections;

public class lab8 {
    public static void main(String[] args) {
        //создание списка
        ArrayList<String> tasks = new ArrayList<>(); 
        //добавление в список
        tasks.add("Сдать сумку в ремонт");
        tasks.add("Забрать посылку с почты");
        tasks.add("Купить продукты");

        //вывод всех задач
        System.err.println("Список задач:");
        for (int i = 0; i < tasks.size(); i++) {
            System.err.println(tasks.get(i));
        }
        
        System.err.println("\nДо удаления 2го элемента");
        //проверить есть ли задача
        if (tasks.contains("Забрать посылку с почты")) {
            System.err.println("Задача 'Забрать посылку с почты' есть в списке");
        } else {
            System.err.println("Задачи 'Забрать посылку с почты' нет в списке");
        }

        //удаление 2й задачи
        tasks.remove(1);

        System.err.println("\nПосле удаления 2го элемента");
        //проверить есть ли задача
        if (tasks.contains("Забрать посылку с почты")) {
            System.err.println("Задача 'Забрать посылку с почты' есть в списке");
        } else {
            System.err.println("Задачи 'Забрать посылку с почты' нет в списке");
        }

        System.err.println("");
        //сортировка по алфавиту
        Collections.sort(tasks);
        System.err.println("Список задач в алфавитном порядке:");
        for (int i = 0; i < tasks.size(); i++) {
            System.err.println(tasks.get(i));
        }
    }
}
