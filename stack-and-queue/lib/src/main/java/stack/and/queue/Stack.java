package stack.and.queue;

import java.util.EmptyStackException;

public class Stack<T> {
    Node<T> top;

    public void push(T value) {
        Node<T> newItem = new Node<T>(value);
        if (top == null) {
            top = newItem;
            newItem.next = null;
        } else {
            newItem.next = top;
            top = newItem;
        }
    }

    public T pop() {
        Node<T> temp = null;
        if (top != null) {
            temp = top;
            top = top.next;
            temp.next = null;
            return temp.value;
        }
        throw new EmptyStackException();
    }

    public T peek() {
        if (!this.isEmpty()) {
            return top.value;
        }
        throw new EmptyStackException();
    }

    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public String toString() {
        Node current = top;
        String stack = "";
        stack = ("TOP -> ");
        while (current != null) {
            stack += "{" + current.value + "} -> ";
            current = current.next;
        }
        stack += "NULL";
        return stack;
    }
}
