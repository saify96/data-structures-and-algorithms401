package queues;

public class Node <T> {
    Node<T> next;
    T value;

    public Node(T value) {
        this.value = value;
    }
}
