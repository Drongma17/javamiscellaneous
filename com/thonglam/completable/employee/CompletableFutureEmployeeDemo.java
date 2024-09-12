package com.thonglam.completable.employee;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureEmployeeDemo {

    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();

        // List of departments to filter by
        List<String> departments = Arrays.asList("IT", "HR");

        // Fetch employees asynchronously
        CompletableFuture<List<Employee>> future = employeeService.getEmployeesByDepartmentsAsync(departments);

        // Non-blocking: Attach a callback to process the result
        future.thenAccept(employees -> {
            System.out.println("Employees retrieved asynchronously:");
            employees.forEach(System.out::println);
        }).exceptionally(ex -> {
            System.err.println("Error occurred: " + ex.getMessage());
            return null;
        });

        // Blocking: Wait for the result if needed
        try {
            List<Employee> employeeList = future.get(); // Blocking call to wait for the result
            System.out.println("Blocking result: ");
            employeeList.forEach(System.out::println);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Shut down the executor service
        employeeService.shutdown();
    }
}
