package graph;

public class Node<v> {
    v value;
    public Node<v> next;

    public Node(v value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{" + value +
                "}";
    }
}
