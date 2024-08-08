import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8CodingChallenge {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

       List<Integer> xyz= numbers.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println("---- "+xyz);
        // Challenge 1: Print all numbers in the list
        System.out.println("Challenge 1: Print all numbers in the list");
        numbers.forEach(System.out::println);

        // Challenge 2: Print the squares of all numbers in the list
        System.out.println("\nChallenge 2: Print the squares of all numbers in the list");
        numbers.stream()
               .map(n -> n * n)
               .forEach(System.out::println);

        // Challenge 3: Print only the even numbers
        System.out.println("\nChallenge 3: Print only the even numbers");
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);

        // Challenge 4: Get the sum of all numbers
        System.out.println("\nChallenge 4: Get the sum of all numbers");
        int sum = numbers.stream()
                         .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        // Challenge 5: Create a new list with the squares of all numbers
        System.out.println("\nChallenge 5: Create a new list with the squares of all numbers");
        List<Integer> squaresList = numbers.stream()
                                          .map(n -> n * n)
                                          .collect(Collectors.toList());
        squaresList.forEach(System.out::println);
    }
}
