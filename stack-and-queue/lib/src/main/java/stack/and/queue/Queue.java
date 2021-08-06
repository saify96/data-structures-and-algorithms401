package stack.and.queue;

import java.util.EmptyStackException;

public class Queue<T> {
    Node front;
    Node rear;

    public void Enqueue(T value) {
        Node<T> newItem = new Node<T>(value);
        if (front == null) {
            front = newItem;
            rear = newItem;
            front.next = null;
        } else {
            rear.next = newItem;
            rear = newItem;
        }
    }
    public T dequeue () {
        if (!isEmpty()){
            Node temp;
            temp=front;
            front=front.next;
            temp.next=null;
            return (T)temp.value;
        }
        throw new EmptyStackException();
    }


    public T peek(){
        if(!isEmpty()){
            return (T) front.value;
        }
         throw new EmptyStackException();
    }


    public boolean isEmpty (){
        return front == null;
    }


    @Override
    public String toString() {
        Node current = front;
        String queue = "";
        queue ="FRONT -> ";
        while (current != null) {
            queue += "{" + current.value + "} -> ";
            current = current.next;
        }
        queue += "NULL";
        return queue;
    }
}
