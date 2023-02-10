package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue,
                                                Queue<Integer> secondQueue) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.offer(firstQueue.remove());
        deque.offer(firstQueue.remove());
        deque.offer(secondQueue.remove());
        deque.offer(secondQueue.remove());
        while (!firstQueue.isEmpty()) {
            firstQueue.add(deque.removeLast());
            deque.offer(firstQueue.remove());
            deque.offer(firstQueue.remove());

            secondQueue.add(deque.removeLast());
            deque.offer(secondQueue.remove());
            deque.offer(secondQueue.remove());
        }
        return deque;
    }
}
