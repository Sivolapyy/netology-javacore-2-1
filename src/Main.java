import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // Не совсем понял что это значит (цитата из задания ниже):
            //Реализуйте два класса Main и StreamMain, в каждом из которых в функции main() составьте ArrayList из
            //приведенных выше чисел и произведите над ними указанные операции, причем:
        // Сделал задание без дополнительных классов, добавил комменатрии где задача решается через коллекции, а
        // а где через Stream API...


        // Решение с использованием коллекций
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> resultList = new ArrayList<>();

        for (Integer i : intList) {
            if (i > 0 && i % 2 == 0) {
                resultList.add(i);
            }
        }
        Collections.sort(resultList);
        System.out.println(resultList);


        // Решение с использованием Stream API
        Stream<Integer> stream = intList.stream();

        stream
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(s -> System.out.print(s + " "));
    }
}
