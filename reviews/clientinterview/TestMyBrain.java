package reviews.clientinterview;

import java.util.*;

public class TestMyBrain {



        public static void main(String[] args) {
            Map<String, List<String>> employeeMap = new HashMap<>();

            // Add employees to the map
            List<String> employeesInDepartmentA = new ArrayList<>();
            employeesInDepartmentA.add("Alice");
            employeesInDepartmentA.add("Bob");
            employeeMap.put("Department A", employeesInDepartmentA);

            List<String> employeesInDepartmentB = new ArrayList<>();
            employeesInDepartmentB.add("Charlie");
            employeesInDepartmentB.add("David");
            employeeMap.put("Department B", employeesInDepartmentB);

            // Access and print the map entries
            for (Map.Entry<String, List<String>> entry : employeeMap.entrySet()) {
                System.out.println("Department: " + entry.getKey());
                System.out.println("Employees: " + entry.getValue());

        }
    }
}
