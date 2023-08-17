package basic;

import java.util.PriorityQueue;

public class BinaryHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(3);
        minHeap.offer(1);
        minHeap.offer(2);
        
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
    }
}
