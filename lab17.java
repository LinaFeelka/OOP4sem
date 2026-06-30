import java.util.HashMap;
import java.util.Map;

public class lab17 {
    public static void main(String[] args) {
        HashMap<String, Integer> journal = new HashMap<>();

        journal.put("Роберт", 15);
        journal.put("Виктория", 97);
        journal.put("Анастасия", 65);
        journal.put("Валера", 43);
        journal.put("Юлия", 82);

        //вывод оценки конкретного студента
        System.err.println("Оценка Юлии: " + journal.get("Юлия"));

        //проверить есть ли стуент
        String check = "Ольга";
        if (journal.containsKey(check)) {
            System.err.println("Студент " + check + " есть в журнале.");
        } else {
            System.err.println("Студента " + check + " нет в журнале.");
        }

        //удалить одного из студентов
        journal.remove("Валера");
        System.err.println("Список оставшихся записей: ");
        for (Map.Entry<String, Integer> entry : journal.entrySet()) {
            System.err.println("Студент " + entry.getKey() + ", оценка: " + entry.getValue());
        }
    }
}
