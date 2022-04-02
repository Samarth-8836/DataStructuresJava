package com.patelsamarth.DsAndAlgo.Stack;

@SuppressWarnings("unchecked")
public class stack_array_implementation {
    public static void main(String []args) {
        stack_array_implementation ref = new stack_array_implementation();
        Stack<Integer> newStack = ref.new Stack<>(4);
        newStack.push(5);
        System.out.println(newStack.peak());
        newStack.push(15);
        System.out.println(newStack.peak());
        newStack.push(25);
        System.out.println(newStack.peak());
        newStack.push(35);
        System.out.println(newStack.peak());
        newStack.pop();
        System.out.println(newStack.peak());
        newStack.pop();
        System.out.println(newStack.peak());
        newStack.pop();
        System.out.println(newStack.peak());
        newStack.pop();
        System.out.println(newStack.peak());
        newStack.pop();
        System.out.println(newStack.peak());
        newStack.deleteStack();
    }

    public class Stack<T> {
        T[] arr;
        int topOfStack;

        public Stack(int size) {
            this.arr = (T[])new Object[size];
            this.topOfStack = -1;
            System.out.println("Stack created with size " + size);
        }

        public boolean isEmpty() {
            if(topOfStack == -1) {
                return true;
            }
            return false;
        }

        public boolean isFull() {
            if(topOfStack == arr.length - 1) {
                return true;
            }
            return false;
        }

        public void push(T value) {
            if(this.isFull()) {
                System.out.println("Stack is full");
                return;
            }
            arr[topOfStack + 1] = value;
            topOfStack++;
        }

        public T pop() {
            if(this.isEmpty()) {
                try {
                    throw new Exception("Stack is already empty");
                }
                catch(Exception ex) {
                    System.out.println(ex.getMessage());
                }
                T newT = (T)(Object)Integer.MIN_VALUE;
                return newT;
            }
            T topElement = arr[topOfStack];
            topOfStack--;
            return topElement;
        }

        public T peak() {
            if(this.isEmpty()) {
                try {
                    throw new Exception("Stack is Empty");
                }
                catch(Exception ex) {
                    System.out.println(ex.getMessage());
                }
                T newT = (T)(Object)Integer.MIN_VALUE;
                return newT;
            }
            return arr[topOfStack];
        }

        public void deleteStack() {
            arr = null;
            System.out.println("Stack deleted");
        }
    }
}
