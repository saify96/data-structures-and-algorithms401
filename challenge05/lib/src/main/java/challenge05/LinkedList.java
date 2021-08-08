package challenge05;

import java.util.ArrayList;

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
        return data;
    }

    public void append(int value) {
        Node current = head;
        if (current == null) {
            Node newItem = new Node(value);
            head = newItem;
        } else if (current != null) {
            while (current.next != null) {
                current = current.next;
            }
            Node newItem = new Node(value);
            newItem.next = null;
            current.next = newItem;
        }
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

    public int kthFromEnd(int k) throws IndexOutOfBoundsException {
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

    public LinkedList zipLists(LinkedList x, LinkedList y) {
        LinkedList zippedList = new LinkedList();
        if (x.head == null && y.head == null) {
            System.out.println("The lists are empty");
        } else if (x.head == null) {
            System.out.println("The first list is empty, here is the second one");
            zippedList = y;
            return zippedList;
        } else if (y.head == null) {
            System.out.println("The second list is empty, here is the first one");
            zippedList = x;
            return zippedList;
        }
        Node currentX = x.head;
        Node currentY = y.head;
        while (currentX.next != null && currentY.next != null) {
            zippedList.append(currentX.value);
            zippedList.append(currentY.value);
            currentX = currentX.next;
            currentY = currentY.next;
        }
        zippedList.append(currentX.value);
        zippedList.append(currentY.value);
        if (currentX.next != null) {
            while (currentX.next != null) {
                currentX = currentX.next;
                zippedList.append(currentX.value);
            }
        } else if (currentY.next != null) {
            while (currentY.next != null) {
                currentY = currentY.next;
                zippedList.append(currentY.value);
            }
        }
        return zippedList;
    }

    public LinkedList reverseLinkedList(LinkedList x) {
        LinkedList reversedLinkedList = new LinkedList();
        Node current = x.head;
        while (current.next != null) {
            reversedLinkedList.insert(current.value);
            current = current.next;
        }
        reversedLinkedList.insert(current.value);
        return reversedLinkedList;
    }

    public boolean checkLinkedList(LinkedList x) {
        LinkedList reversedLinkedList = new LinkedList();
        reversedLinkedList = reverseLinkedList(x);
        if (reversedLinkedList.toString().equals(x.toString())) {
            return true;
        }
        return false;
    }

    public static boolean equality(LinkedList s) {
        Node current = s.head;
        ArrayList<Integer> list = new ArrayList<>();
        while (current != null) {
            list.add(current.value);
            current = current.next;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != list.get(list.size() - i-1)) {
                return false;
            }
        }
        return true;
    }

}
