package com.company;

/**
 * Created by ssahoo on 12/17/18.
 */
public class TreeNode {
  int value;
  TreeNode left;
  TreeNode right;

  public TreeNode(int value) {
    this.value = value;
    this.left = null;
    this.right = null;
  }
  public String toString(TreeNode root){
    return String.valueOf(root.value);
  }
}
