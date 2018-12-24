package com.company;

/**
 * Created by ssahoo on 12/17/18.
 */
public class TreeBuilder {

  public TreeNode buildBinaryTree() {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(16);
    root.right = new TreeNode(5);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(11);
    root.left.right = new TreeNode(-3);
    return root;
  }
  public TreeNode buildBinaryTree10() {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(20);
    root.left.left = new TreeNode(40);
    root.left.right = new TreeNode(50);
    root.right = new TreeNode(30);
    root.right.left = new TreeNode(60);
    root.right.right = new TreeNode(50);
    return root;
  }
}
