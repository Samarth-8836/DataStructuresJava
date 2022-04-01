package com.patelsamarth.DsAndAlgo.LinkedList;

public class LinkedList_implementation_singleLL {
    public static void main(String[] args) {
        LinkedList_implementation_singleLL ref = new LinkedList_implementation_singleLL();
        Single_LL<String> linkedList = ref.new Single_LL<>();
        linkedList.createLL("ABC5");
        System.out.println(linkedList.head.value);
    }

    public class Node<T> {
        public T value;
        public Node<T> next;
    }

    public class Single_LL<T> {
        public Node<T> head;
        public Node<T> tail;
        public int size;

        public Node<T> createLL(T nodeValue) {
            head = new Node<T>();
            tail = new Node<T>();
            Node<T> node = new Node<T>();
            node.value = nodeValue;
            node.next = null;
            head = node;
            tail = node;
            return head;
        }
    }
}
