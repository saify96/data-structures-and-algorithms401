package challenge05;

public class LinkedList {
    Node head;
    public void insert(int value) {
        Node newItem = new Node(value);
        if (head == null) {
            head = newItem;
        } else {
            newItem.next = head;
            head = newItem;
        }
    }

    public boolean includes(int value) {
        Node current = head;
        while (current != null) {
            if (value == current.value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public String toString() {
        String data = "";
        Node current = head;
        while (current != null) {
            data = data + "{" + current.value + "} -> ";
            current = current.next;
        }
        data += "NULL";
        System.out.print(data);
        return data;
    }

    public void append(int value) {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        Node newItem = new Node(value);
        newItem.next = null;
        current.next = newItem;
    }

    public void insertBefore(int value, int newValue) {
        Node newItem = new Node(newValue);
        Node current = head;
        if (head.value == value) {
            newItem.next = head;
            head = newItem;
            return;
        }
        while (current != null) {
            if (current.next.value == value) {
                newItem.next = current.next;
                current.next = newItem;
                return;
            }
            current = current.next;
        }
    }

    public void insertAfter(int value, int newValue) {
        Node newItem = new Node(newValue);
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                newItem.next = current.next;
                current.next = newItem;
            }
            current = current.next;
        }
    }

    public int kthFromEnd(int k) {
        int counter = 0;
        Node current = head;
        while (current != null) {
            current = current.next;
            counter++;
        }
        int idx;
        idx = counter - k - 1;
        current = head;
        for (int i = 0; i < idx; i++) {
            current = current.next;
        }
        if (k > counter - 1 || k < 0) {
            throw new IndexOutOfBoundsException("out of boundaries");
        } else if (counter == 1) {
            System.out.println("you have only one value in the list");
        }
        return current.value;
    }
}

