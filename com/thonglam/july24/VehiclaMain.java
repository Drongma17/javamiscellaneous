package com.thonglam.july24;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VehiclaMain {


    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Vehicle(1, "black", 2));
        vehicleList.add(new Vehicle(2, "black", 3));
        vehicleList.add(new Vehicle(3, "black", 4));
        vehicleList.add(new Vehicle(4, "black", 5));
        vehicleList.add(new Vehicle(5, "black", 3));
        vehicleList.add(new Vehicle(6, "black", 4));
        vehicleList.add(new Vehicle(7, "black", 1));
        vehicleList.add(new Vehicle(8, "black", 2));



    vehicleList.stream().filter(vehicle -> vehicle.getAge() == 3)
            .map(Vehicle::getId)
            .forEach(x-> System.out.print(x+" "));

        System.out.println();
        Map<Integer, List<Vehicle>> vehicleMap = vehicleList.stream().collect(Collectors.groupingBy(Vehicle::getId));

    vehicleMap.entrySet().stream()
            .flatMap(InterListEntry->InterListEntry.getValue().stream())
            .filter(vehicle -> vehicle.getAge()<3)
            .map(Vehicle::getId)
            .forEach(System.out::println);
    }
}
