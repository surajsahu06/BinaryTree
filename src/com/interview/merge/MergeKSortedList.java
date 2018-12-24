package com.interview.merge;

import java.util.PriorityQueue;

/**
 * Merge K Sorted List's;
 */
public class MergeKSortedList {
  public static void main(String[] args) {
    MergeKSortedList mergeKSortedList = new MergeKSortedList();
    ListNode[] sample = mergeKSortedList.buildSampleList();
    ListNode result = mergeKSortedList.mergeKLists(sample);
    ListNode current = result;
    while(current!=null){
      System.out.print(current.val + " ");
      current = current.next;
    }
  }

  public ListNode mergeKLists(ListNode[] lists) {
    ListNode result = new ListNode(Integer.MIN_VALUE);
    ListNode current = result;
    PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
    for (int i = 0; i < lists.length; i++) {
      while (lists[i] != null) {
        queue.add(lists[i].val);
        lists[i] = lists[i].next;
      }
    }
    while (!queue.isEmpty()) {
      ListNode newNode = new ListNode(queue.poll());
      current.next = newNode;
      current = current.next;
    }
    return result.next;
  }

  public ListNode[] buildSampleList() {
    ListNode first = new ListNode(1);
    first.next = new ListNode(4);
    first.next.next = new ListNode(5);

    ListNode second = new ListNode(1);
    second.next = new ListNode(3);
    second.next.next = new ListNode(3);

    ListNode third = new ListNode(1);
    third.next = new ListNode(4);
    third.next.next = new ListNode(5);
    ListNode[] listNodes = new ListNode[3];
    listNodes[0] = first;
    listNodes[1] = second;
    listNodes[2] = third;
    return listNodes;
  }
}

class ListNode {
  int val;
  ListNode next;

  ListNode(int val) {
    this.val = val;
  }

  @Override
  public String toString() {
    return this.val + " ";
  }
}
