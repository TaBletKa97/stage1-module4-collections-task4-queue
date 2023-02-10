package com.epam.collections.queue;

import java.util.*;
import java.util.stream.Stream;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> priorityQueue
                = new PriorityQueue<>(Collections.reverseOrder());
        Stream.concat(firstList.stream(), secondList.stream())
                .forEach(priorityQueue::add);
        return priorityQueue;
    }
}
