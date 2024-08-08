import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class MapCodingChallenge {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 22),
                new Person("David", 28),
                new Person("David", 69),
                new Person("David", 46),
                new Person("David", 50)
        );

        // Your challenge:
        // Create a Map<String, Integer> where the key is the person's name and the value is their age.
        // Use Java streams and the Collectors.toMap() method.

        Map<String, Integer> nameToAgeMap = people.stream()
                // Your code here
                .collect(Collectors.toMap(Person::getName, Person::getAge));

        // Print the resulting map
        System.out.println(nameToAgeMap);


        Map<Integer, List<Person>> personAgeList = people.stream().collect(Collectors.groupingBy(Person::getAge));


    }
}
