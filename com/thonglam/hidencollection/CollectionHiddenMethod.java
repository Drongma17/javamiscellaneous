package com.thonglam.hidencollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionHiddenMethod {

    public static void main(String[] args) {

        //Collections.nCopies()
        List<String> names = Collections.nCopies(5, "thonglam");
        System.out.println(names);

        try {
            names.set(0, "demo collection");
        } catch (UnsupportedOperationException e) {
            System.out.println("List is immutable, it can't be modified");
        }


        //Collections.frequency()
        List<Integer> numbers = Arrays.asList(4, 1, 2, 3, 4, 2, 3, 1, 3, 4, 5, 6, 5, 6, 4, 2, 4, 5, 6, 2, 34, 5, 6);
        long count = Collections.frequency(numbers, 4);
        System.out.println("number occurred " + count);


        Map<Integer, Integer> countMap = numbers.stream()
                .collect(Collectors.toMap(nuber -> nuber, number ->
                                Collections.frequency(numbers, number),
                (existingValue, newValue) -> existingValue));
        System.out.println(countMap);





    }
}
