package com.patelsamarth.DsAndAlgo.Tree;

import java.util.ArrayList;

public class tree_implementation {
    public static void main(String[] args) {
        tree_implementation ref = new tree_implementation();
        TreeNode<String> drinks = ref.new TreeNode<>("Drinks");
        TreeNode<String> hot = ref.new TreeNode<>("Hot");
        TreeNode<Integer> cold = ref.new TreeNode<>(55);
        TreeNode<String> superCold = ref.new TreeNode<>("555");


        drinks.addChild(hot);
        drinks.addChild(cold);
        cold.addChild(superCold);

        System.out.println(drinks.print(0));
    }

    public class TreeNode<T> {
        T data;
        ArrayList<TreeNode> children;

        public TreeNode(T data) {
            this.data = data;
            this.children = new ArrayList<TreeNode>();
        }

        public void addChild(TreeNode node) {
            this.children.add(node);    
        }

        public String print(int level) {
            String ret;
            ret = "  ".repeat(level) + data + "\n";
            for(TreeNode node: this.children) {
                ret += node.print(level + 1);
            }
            return ret;
        }
    }
}
