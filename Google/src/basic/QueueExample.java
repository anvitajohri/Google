package basic;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        
        // Poll elements from the queue
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }
}