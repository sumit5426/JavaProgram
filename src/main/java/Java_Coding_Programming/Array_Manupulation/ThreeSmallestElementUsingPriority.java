package Java_Coding_Programming.Array_Manupulation;

import java.util.PriorityQueue;

public class ThreeSmallestElementUsingPriority {
    public static void main(String[] args) {
        int[] arr = {7, 3, 1, 4, 9, 2}; // Example array
        System.out.println("3rd smallest element: " + findThirdSmallest(arr));
    }

    public static int findThirdSmallest(int[] arr) {
        if (arr == null || arr.length < 3) {
            throw new IllegalArgumentException("Array must have at least three elements.");
        }

        // Step 1: Create a min-heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Step 2: Add all elements to the heap
        for (int num : arr) {
            minHeap.add(num);
        }

        // Step 3: Remove the smallest element (poll 3 times)
        minHeap.poll(); // Remove 1st smallest
        minHeap.poll(); // Remove 2nd smallest
        return minHeap.poll(); // Remove and return the 3rd smallest
    }
}
