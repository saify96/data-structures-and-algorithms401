package challenge05;

public class Main {
    public static void main(String[] args) {
//        LinkedList testLL2 = new LinkedList();
//        testLL2.append(5);
//        testLL2.append(6);
//        testLL2.append(7);
//        testLL2.append(8);
//        testLL2.append(9);
//        testLL2.append(10);
//        LinkedList newList = new LinkedList();
//        newList = newList.reverseLinkedList(testLL2);
//
//        System.out.println(testLL2.toString());
//        System.out.println(newList.toString());

//        LinkedList testLL2 = new LinkedList();
//        testLL2.append(5);
//        testLL2.append(6);
//        testLL2.append(7);
//        testLL2.append(8);
//        LinkedList newList = new LinkedList();
//        boolean potato = newList.checkLinkedList(testLL2);
//
//        System.out.println(potato);
//        LinkedList testLL2 = new LinkedList();
//        testLL2.insert(5);
//        testLL2.insert(6);
//        testLL2.insert(7);
//        testLL2.insert(8);
////        LinkedList newList = new LinkedList();
////        newList = newList.reverseLinkedList(testLL2);
//        System.out.println(testLL2.toString());
        LinkedList testLL2 = new LinkedList();
        testLL2.append(5);
        testLL2.append(6);
        testLL2.append(7);
        testLL2.append(6);
        testLL2.append(7);
        LinkedList newList = new LinkedList();
        boolean potato = newList.equality(testLL2);
        System.out.println(potato);

//        newList = newList.checkLinkedList(testLL2);

//        System.out.println(newList.toString());


    }
}
