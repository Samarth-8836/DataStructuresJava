package com.patelsamarth.DsAndAlgo.LinkedList;

public class LinkedList_implementation_singleLL {
    public static void main(String[] args) {
        LinkedList_implementation_singleLL ref = new LinkedList_implementation_singleLL();
        Single_LL linkedList = ref.new Single_LL();
        Node headRef = linkedList.createLL(5);
        System.out.println(headRef.value);
    }

    public class Node {
        public int value;
        public Node next;
    }

    public class Single_LL {
        public Node head;
        public Node tail;
        public int size;

        public Node createLL(int nodeValue) {
            head = new Node();
            tail = new Node();
            Node node = new Node();
            node.value = nodeValue;
            node.next = null;
            head = node;
            tail = node;
            return head;
        }
    }
}
