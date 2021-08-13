package trees;

public class Node<T extends Comparable<T>> {
    Node<T> right;
    Node<T> left;
    T value;

    Node() {
    }

    Node(T value) {
        this.value = value;

    }

    public Node(Node<T> right, Node<T> left, T value) {
        this.right = right;
        this.left = left;
        this.value = value;
    }

}
