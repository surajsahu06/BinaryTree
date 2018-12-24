package com.company;

import java.util.ArrayList;
import java.util.List;

public class RootToLeafSum {
  public static void main(String[] args) {
    RootToLeafSum rootToLeafSum = new RootToLeafSum();
    TreeBuilder treeBuilder = new TreeBuilder();
    TreeNode root = treeBuilder.buildBinaryTree();
    List<Integer> list = new ArrayList<Integer>();
    rootToLeafSum.rootToLeafSum(root, 26, list);
    System.out.println(list);
  }

  private boolean rootToLeafSum(TreeNode root, int sum, List<Integer> path) {
    if (root == null) {
      return false;
    }
    if (root.left == null && root.right == null) {
      if (root.value == sum) {
        path.add(root.value);
        return true;
      }
      else {
        return false;
      }
    }
    if(rootToLeafSum(root.left, sum - root.value, path)){
      path.add(root.value);
      return true;
    }
    if(rootToLeafSum(root.right, sum - root.value, path)){
      path.add(root.value);
      return true;
    }
    return false;
  }
}