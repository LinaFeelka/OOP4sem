import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Random;

public class lab13 {
    public static void main(String[] args) {
        //создать список из 5 имен
        ArrayList<String> names = new ArrayList<>();
        names.add("Лина");
        names.add("Настя");
        names.add("Женя");
        names.add("Карина");
        names.add("Женя");
        System.err.println("Все имена: " + names);

        //передать элементы в HashSet для удаления дубликатов
        Set<String> noRepeat = new HashSet<>(names);
        System.err.println("Имена без повторов: " + noRepeat);

        //словарь HashMap
        Map<String, Integer> scores = new HashMap<>();

        Random random = new Random();

        //заполнить словарь оценками
        for (String name : noRepeat) {
            int score = random.nextInt(100) + 1; //оценки от 1 до 100
            scores.put(name, score);
        }
        
        //вывести словарь
        System.out.println("\nИтоговые оценки студентов:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println("Имя: " + entry.getKey() + ", Итоговый балл: " + entry.getValue());
        }
    }
}
