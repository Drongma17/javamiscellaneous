package com.thonglam.algorithms;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> shoppingList= new LinkedList<>();
        shoppingList.add("apple");
        shoppingList.add("banana");
        shoppingList.add("mango");

        System.out.println(shoppingList);

        shoppingList.add(3, "orange");
        System.out.println(shoppingList);

        shoppingList.removeFirst();
        System.out.println(shoppingList);

        List<String> synchronizedList= Collections.synchronizedList(shoppingList);
        System.out.println(synchronizedList);
    }
}
