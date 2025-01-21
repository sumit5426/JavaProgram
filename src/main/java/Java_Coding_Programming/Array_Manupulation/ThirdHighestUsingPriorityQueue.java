package Java_Coding_Programming.Array_Manupulation;

import java.util.PriorityQueue;

public class ThirdHighestUsingPriorityQueue {

        public static void main(String[] args) {
            int[] arr = {7, 2, 10, 4, 6, 8, 1};

            // PriorityQueue with natural ordering (Min-Heap)
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            // Add elements to the heap
            for (int num : arr) {
                minHeap.add(num);

                // Ensure the heap size does not exceed 3
                if (minHeap.size() > 3) {
                    minHeap.poll(); // Remove the smallest element
                }
            }

            // The root of the heap now contains the 3rd highest element
            if (minHeap.size() == 3) {
                System.out.println("The 3rd highest element is: " + minHeap.peek());
            } else {
                System.out.println("The array does not have enough elements.");
            }
        }
    }

