package stack.and.queue;

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

    @Override
    public String toString() {
        Node current = front;
        String queue = "";
        System.out.print("TOP -> ");
        while (current != null) {
            queue += "{" + current.value + "} -> ";
            current = current.next;
        }
        queue += "NULL";
        return queue;
    }
}
