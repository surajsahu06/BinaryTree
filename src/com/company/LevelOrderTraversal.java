package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderTraversal {
  public static void main(String[] args) {
    LevelOrderTraversal levalByLevelPrinting = new LevelOrderTraversal();
    TreeBuilder treeBuilder = new TreeBuilder();
    TreeNode root = treeBuilder.buildBinaryTree10();
    List<List<Integer>> list = levalByLevelPrinting.levelByLevalPrint(root);
    System.out.println(list);
    System.out.println("post order");
    levalByLevelPrinting.postOrder(root);
    System.out.println("\nspiral order");
    levalByLevelPrinting.printSpiralOrder(root);
  }
  private void printSpiralOrder(TreeNode root){
    Stack<TreeNode> leftRight = new Stack<TreeNode>();
    Stack<TreeNode> rightLeft = new Stack<TreeNode>();
    if(root==null){
      return;
    }
    leftRight.push(root);
    while(!leftRight.isEmpty() || !rightLeft.isEmpty()){
      while (!leftRight.isEmpty()){
        TreeNode topQueueNode = leftRight.pop();
        System.out.print(topQueueNode.value +" ");
        if(topQueueNode.left!=null){
          rightLeft.push(topQueueNode.left);
        }
        if(topQueueNode.right!=null){
          rightLeft.push(topQueueNode.right);
        }
      }
      System.out.println();
      while (!rightLeft.isEmpty()){
        TreeNode topStackNode = rightLeft.pop();
        System.out.print(topStackNode.value + " ");
        if(topStackNode.right!=null){
          leftRight.push(topStackNode.right);
        }
        if(topStackNode.left!=null){
          leftRight.push(topStackNode.left);
        }
      }
      System.out.println();
    }
  }

  private List<List<Integer>> levelByLevalPrint(TreeNode root) {
    Queue<TreeNode> q1 = new LinkedList<TreeNode>();
    Queue<TreeNode> q2 = new LinkedList<TreeNode>();
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    if (root == null) {
      return list;
    }
    q1.offer(root);
    while (!q1.isEmpty() || !q2.isEmpty()) {
      List<Integer> first = new ArrayList<Integer>();
      while (!q1.isEmpty()) {
        TreeNode current = q1.poll();
        System.out.print(current.value + " ");
        if (current.left != null) {
          q2.offer(current.left);
        }
        if (current.right != null) {
          q2.offer(current.right);
        }
      }
      System.out.println();
      List<Integer> second = new ArrayList<Integer>();
      while (!q2.isEmpty()) {
        TreeNode current = q2.poll();
        second.add(current.value);
        System.out.print(current.value + " ");
        if (current.left != null) {
          q1.offer(current.left);
        }
        if (current.right != null) {
          q1.offer(current.right);
        }
      }
      System.out.println();
    }
    return list;
  }
  private void postOrder(TreeNode root){
    Stack<TreeNode> stack1 = new Stack<TreeNode>();
    Stack<TreeNode> stack2 = new Stack<TreeNode>();
    if(root==null){
      return;
    }
    stack1.push(root);
    while(!stack1.isEmpty()){
      TreeNode topStackNode = stack1.pop();
      stack2.push(topStackNode);
      if(topStackNode.left!=null){
        stack1.push(topStackNode.left);
      }
      if(topStackNode.right!=null){
        stack1.push(topStackNode.right);
      }
    }
    while (!stack2.isEmpty()){
      TreeNode node = stack2.pop();
      System.out.print(node.value +" ");
    }
  }
  private void inorderTraversal(TreeNode root){
    Stack<TreeNode> stack = new Stack<TreeNode>();
    if(root==null){
      return;
    }
    while(root!=null){
      stack.push(root);
      root = root.left;
      if(root==null){
        System.out.println(stack.pop().value +" ");
        root = root.right;
      }
    }

  }
}
