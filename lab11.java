import java.util.*;
import java.util.stream.Collectors;

public class lab11 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, -2, 3, -4, 5);

        System.out.println("Первоначальный список: " + numbers);

        List<Integer> positiveNumbers = numbers.stream()
            .filter(n -> n > 0)
             .map(n -> n * n)
            .collect(Collectors.toList());
        System.out.println("Положительные числа, возведенные в квадрат: " + positiveNumbers);        
    }
}
