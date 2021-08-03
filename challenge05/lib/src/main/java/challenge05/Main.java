package challenge05;

public class Main {
    public static void main(String[] args) {
        LinkedList testLL = new LinkedList();
        LinkedList testLL2 = new LinkedList();
        testLL2.insert(5);
        testLL2.append(6);
        testLL2.append(7);
        testLL2.append(8);
        LinkedList zippedList = new LinkedList();
        zippedList = zippedList.zipLists(testLL,testLL2);
        System.out.println(zippedList.toString());
    }
}
