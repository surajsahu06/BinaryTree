package com.interview.merge;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Merge k sorted Array
 */
public class MergeSortedArray {
  public static void main(String[] args) {
    int[][] arrays = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
    MergeSortedArray mergeSortedArray = new MergeSortedArray();
    mergeSortedArray.merge(arrays, 3);
  }

  private void merge(int[][] arrays, int k) {
    int[] result = new int[arrays.length * k];
    PriorityQueue<Integer> queue = new PriorityQueue();
    for (int i = 0; i < k; i++) {
      for (int j = 0; j < arrays[i].length; j++) {
        queue.add(arrays[i][j]);
      }
    }
    int q = 0;
    while (!queue.isEmpty()) {
      result[q] = queue.poll();
      q++;
    }
    System.out.println(Arrays.toString(result));
  }
}
