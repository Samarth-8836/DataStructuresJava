package com.patelsamarth.DsAndAlgo.Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Binary_Tree_Implementation {
    public static void main(String[] args) {
        Binary_Tree_Implementation ref = new Binary_Tree_Implementation();
        BinaryTreeLL bt = ref.new BinaryTreeLL();
    }

    public class BinaryNode {
        String value;
        BinaryNode left;
        BinaryNode right;
        int height;
    }

    public class BinaryTreeLL{
        BinaryNode root;

        public BinaryTreeLL() {
            this.root = null;
        }

        // pre order traversal
        void preOrder(BinaryNode node) {
            if(node == null) {
                return;
            }
            System.out.print(node.value + " ");
            preOrder(node.left);
            preOrder(node.right);
        }

        // in order traversal
        void inOrder(BinaryNode node) {
            if(node == null) {
                return;
            }
            inOrder(node.left);
            System.out.print(node.value + " ");
            inOrder(node.right);
        }

        // post order traversal
        void postOrder(BinaryNode node) {
            if(node == null) {
                return;
            }
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.value + " ");
        }

        // level order traversal
        void levelOrder() {
            Queue<BinaryNode> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()) {
                BinaryNode presentNode = queue.remove();
                System.out.println(presentNode.value + " ");
                if(presentNode.left != null) {
                    queue.add(presentNode.left);
                }
                if(presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            }
        }

        // search using level order traversal
        void search(String value) {
            Queue<BinaryNode> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()) {
                BinaryNode presentNode = queue.remove();
                if(presentNode.value == value) {
                    System.out.println(value + " present in tree");
                    return;
                }
                if(presentNode.left != null) {
                    queue.add(presentNode.left);
                }
                if(presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            }
            System.out.println(value + " not present in tree");
            return;
        }
    }
}
