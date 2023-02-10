package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> resultList = new ArrayList<>();
        LinkedList<Integer> dishes = new LinkedList<>();
        IntStream.range(1, numberOfDishes + 1).forEach(dishes::add);
        while (!dishes.isEmpty()) {
            for (int i = 0; i < everyDishNumberToEat -1; i++) {
                dishes.addLast(dishes.poll());
            }
            resultList.add(dishes.poll());
        }
        return resultList;
    }
}
