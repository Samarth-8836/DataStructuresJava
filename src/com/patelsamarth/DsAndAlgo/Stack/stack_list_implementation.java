package com.patelsamarth.DsAndAlgo.Stack;

@SuppressWarnings("unused")
public class stack_list_implementation {
    public static void main(String []args) {
        stack_list_implementation ref = new stack_list_implementation();

    }

    public class Stack<T> {
        Single_LL<T> s;

        public Stack() {
            s = new Single_LL<>();
        }

        public void push(T value) {
            
        }
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
