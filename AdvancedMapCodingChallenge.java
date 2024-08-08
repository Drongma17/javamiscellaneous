import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Transaction {
    private String category;
    private double amount;

    public Transaction(String category, double amount) {
        this.category = category;
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }
}

public class AdvancedMapCodingChallenge {

    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("Grocery", 50.0),
                new Transaction("Electronics", 1200.0),
                new Transaction("Grocery", 30.0),
                new Transaction("Clothing", 200.0),
                new Transaction("Electronics", 800.0),
                new Transaction("Clothing", 150.0)
        );

        // Your challenge:
        // Create a Map<String, Double> where the key is the category and the value is the total amount for that category.
        // Use Java streams and the Collectors.groupingBy() and Collectors.summingDouble() methods.

        Map<String, Double> categoryToTotalAmountMap = transactions.stream()
                // Your code here
                .collect(Collectors.groupingBy(Transaction::getCategory, Collectors.summingDouble(Transaction::getAmount)));

        // Print the resulting map
        System.out.println(categoryToTotalAmountMap);


        Map<String, Double> collect = transactions.stream().collect(Collectors.groupingBy(Transaction::getCategory, Collectors.summingDouble(Transaction::getAmount)));
        System.out.printf(collect.toString());
    }
}
