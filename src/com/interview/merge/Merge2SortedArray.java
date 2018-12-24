package com.interview.merge;

import java.util.Arrays;

/**
 * Created by ssahoo on 12/23/18.
 */
public class Merge2SortedArray {
  public static void main(String[] args) {
    int arr1[] = {1, 3, 4, 5};
    int arr2[] = {2, 4, 6, 8};
    Merge2SortedArray merge2SortedArray = new Merge2SortedArray();
    merge2SortedArray.mergeFromFirstElement(arr1, arr2);
    merge2SortedArray.mergeDuplicateRemoved(arr1, arr2);
  }

  private void mergeFromFirstElement(int[] nums1, int[] nums2) {
    int n1 = nums1.length;
    int n2 = nums2.length;
    int n3 = n1 + n2;
    int[] tres = new int[n3];
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < n1 && j < n2) {
      if (nums1[i] < nums2[j]) {
        tres[k] = nums1[i];
        i++;
        k++;
      }
      else {
        tres[k] = nums2[j];
        j++;
        k++;
      }
    }
    while (i < n1) {
      tres[k] = nums1[i];
      i++;
      k++;
    }
    while (j < n2) {
      tres[k] = nums2[j];
      j++;
      k++;
    }
    System.out.println(Arrays.toString(tres));
  }

  private void mergeDuplicateRemoved(int[] nums1, int[] nums2) {
    int n1 = nums1.length;
    int n2 = nums2.length;
    int n3 = n1 + n2;
    int[] tres = new int[n3];
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < n1 && j < n2) {
      if (nums1[i] == nums2[j]) {
        tres[k] = nums1[i];
        i++;
        j++;
        k++;
      }
      if (nums1[i] < nums2[j]) {
        tres[k] = nums1[i];
        i++;
        k++;
      }
      else {
        tres[k] = nums2[j];
        j++;
        k++;
      }
    }
    while (i < n1) {
      tres[k] = nums1[i];
      i++;
      k++;
    }
    while (j < n2) {
      tres[k] = nums2[j];
      j++;
      k++;
    }
    System.out.println(Arrays.toString(tres));
  }
}
