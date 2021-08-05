package stack.and.queue;

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
        try {
            Node<T> temp = null;
            if (top != null) {
                temp = top;
                top = top.next;
                temp.next = null;
                return temp.value;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public T peek(){
        if(!this.isEmpty()){
            return top.value;
        }
        return null;
    }

    public boolean isEmpty (){
        return top == null;
    }

    @Override
    public String toString() {
        Node current = top;
        String stack = "";
        System.out.print("TOP -> ");
        while (current != null) {
            stack += "{" + current.value + "} -> ";
            current = current.next;
        }
        stack += "NULL";
        return stack;
    }
}
