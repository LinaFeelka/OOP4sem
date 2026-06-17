import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class lab10 {
    private static final String filePath = "students.txt";
    static List<String> students = Arrays.asList("Прокурова Лина", "Жукова Анастасия", "Кобцев Кирилл", "Солошенко Виктория", "Паринова Элина");

    public static void main(String[] args) {
        //запись в файл
        try(FileWriter writer = new FileWriter(filePath, false))
        {
            for (String student : students) { //каждый элемент student из students
                writer.write(student + System.lineSeparator());
            }
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
             return;
        } 

        //чтение из файла
        try {
            List<String> lines = Files.readAllLines(Paths.get("students.txt")); //читает построчно
            System.out.println(lines);
        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
            return;
        } 

    }
}
