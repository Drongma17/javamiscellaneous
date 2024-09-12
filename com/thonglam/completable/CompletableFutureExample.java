package com.thonglam.completable;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureExample {

    public static void main(String[] args) {
        // Run an asynchronous task that returns a result
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("Performing some long-running task...");
                TimeUnit.SECONDS.sleep(2);  // Simulate long task
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Task Completed!";
        });

        // Attach a callback to process the result once it's available
        future.thenAccept(result -> {
            System.out.println("Result from async task: " + result);
        });

        // If you want to wait for the future to complete and get the result
        try {
            String result = future.get();  // This will block until the result is available
            System.out.println("Blocking call result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Example of chaining tasks (with thenApply)
        CompletableFuture<String> chainedFuture = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);  // Simulate another task
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Hello";
        }).thenApply(result -> {
            return result + ", World!";
        });

        // Output chained result
        chainedFuture.thenAccept(result -> {
            System.out.println("Chained result: " + result);
        });

        // Wait for the chaining future to complete
        try {
            chainedFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Example of handling exceptions
        CompletableFuture<Integer> futureWithException = CompletableFuture.supplyAsync(() -> {
            if (true) {
                throw new RuntimeException("Something went wrong!");
            }
            return 1;
        }).exceptionally(ex -> {
            System.out.println("Exception occurred: " + ex.getMessage());
            return 0; // Fallback result
        });

        try {
            Integer result = futureWithException.get();
            System.out.println("Result after exception handling: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
