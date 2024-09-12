package com.thonglam.completable.employee;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class EmployeeService {

    // Hardcoded employee data
    private static final List<Employee> employees = List.of(
            new Employee(1, "John Doe", 50000, "IT"),
            new Employee(2, "Jane Smith", 60000, "HR"),
            new Employee(3, "Emily Johnson", 70000, "Finance"),
            new Employee(4, "Michael Brown", 55000, "IT"),
            new Employee(5, "Sarah Davis", 65000, "Finance"),
            new Employee(6, "David Wilson", 62000, "HR")
    );

    private final ExecutorService executor = Executors.newFixedThreadPool(5); // Thread pool

    // Asynchronous method to get employees by departments
    public CompletableFuture<List<Employee>> getEmployeesByDepartmentsAsync(List<String> departments) {
        return CompletableFuture.supplyAsync(() -> {
            // Simulate fetching data from "backend" by filtering hardcoded employees
            return employees.stream()
                    .filter(emp -> departments.contains(emp.getDepartment()))
                    .collect(Collectors.toList());
        }, executor);
    }

    // Shutdown executor to clean up resources
    public void shutdown() {
        executor.shutdown();
    }
}
