package challenge05;

public class Main {
    public static void main(String[] args) {
        LinkedList testLL = new LinkedList();
        testLL.insert(1);
        testLL.append(2);
        testLL.append(3);
        testLL.append(4);

        System.out.println(testLL.kthFromEnd(10));
//        LinkedList firstLinkedList = new LinkedList();
//        firstLinkedList.insert(5);
//        firstLinkedList.toString();
    }
}
