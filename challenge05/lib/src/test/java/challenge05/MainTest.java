/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge05;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    //challenge05 tests
    @Test public void testInsertMethod() {
        LinkedList firstLinkedList = new LinkedList();
        firstLinkedList.insert(5);
        assertEquals("{5} -> NULL", firstLinkedList.toString());
    }

    @Test public void testIncludesMethod() {
        LinkedList firstLinkedList = new LinkedList();
        firstLinkedList.insert(5);
        firstLinkedList.insert(6);
        firstLinkedList.insert(7);
        assertEquals(true, firstLinkedList.includes(6));
        assertEquals(false, firstLinkedList.includes(8));
    }

    @Test public void testToStringMethod() {
        LinkedList firstLinkedList = new LinkedList();
        firstLinkedList.insert(5);
        firstLinkedList.insert(6);
        firstLinkedList.insert(7);
        assertEquals("{7} -> {6} -> {5} -> NULL", firstLinkedList.toString());
    }

    ///challenge 06 tests
    @Test public void testAppendMethod() {
        LinkedList testLL = new LinkedList();
        testLL.insert(1);
        testLL.append(2);
        testLL.append(3);
        testLL.append(4);
        testLL.append(5);
        testLL.append(666);
        testLL.append(777);
        testLL.append(888);
        assertEquals("{1} -> {2} -> {3} -> {4} -> {5} -> {666} -> {777} -> {888} -> NULL",testLL.toString());
    }

    @Test public void testInsertBefore() {
        LinkedList testLL = new LinkedList();
        testLL.insert(1);
        testLL.append(2);
        testLL.append(3);
        testLL.append(4);
        testLL.append(5);
        testLL.insertBefore(3,666);
        testLL.insertBefore(1,777);
        assertEquals("{777} -> {1} -> {2} -> {666} -> {3} -> {4} -> {5} -> NULL",testLL.toString());
    }

    @Test public void testInsertAfter() {
        LinkedList testLL = new LinkedList();
        testLL.insert(1);
        testLL.append(2);
        testLL.append(3);
        testLL.append(4);
        testLL.append(5);
        testLL.insertAfter(3,666);
        testLL.insertAfter(5,777);
        assertEquals("{1} -> {2} -> {3} -> {666} -> {4} -> {5} -> {777} -> NULL",testLL.toString());
    }
    ///challenge 07 tests
    @Test public void testKInMiddle() {
        LinkedList testLL = new LinkedList();
        testLL.insert(1);
        testLL.append(2);
        testLL.append(3);
        testLL.append(4);
        testLL.append(5);
        assertEquals(3,testLL.kthFromEnd(2));
    }

    @Test public void testLengthEqualsOne() {
        LinkedList testLL = new LinkedList();
        testLL.insert(1);
        assertEquals(1,testLL.kthFromEnd(0));
    }

    @Test public void testLengthEqualsLength() {
        LinkedList testLL = new LinkedList();
        testLL.insert(1);
        testLL.append(2);
        testLL.append(3);
        testLL.append(4);
        testLL.append(5);
        assertEquals(1,testLL.kthFromEnd(4));
    }

    @Test public void testExceptions() {
        LinkedList testLL = new LinkedList();
        testLL.insert(1);
        testLL.append(2);
        testLL.append(3);
        testLL.append(4);
        testLL.append(5);
        assertThrows(NullPointerException .class ,()-> testLL.kthFromEnd(-5));
        assertThrows(IndexOutOfBoundsException .class ,()-> testLL.kthFromEnd(20));
    }
    //challenge 08
    @Test public void testZipLists() {
        LinkedList testLL = new LinkedList();
        testLL.append(1);
        testLL.append(2);
        testLL.append(3);
        testLL.append(4);
        LinkedList testLL2 = new LinkedList();
        testLL2.insert(5);
        testLL2.append(6);
        testLL2.append(7);
        testLL2.append(8);
        LinkedList zippedList = new LinkedList();
        zippedList = zippedList.zipLists(testLL,testLL2);
        assertEquals("{1} -> {5} -> {2} -> {6} -> {3} -> {7} -> {4} -> {8} -> NULL",zippedList.toString());
    }
    @Test public void testZipVoidLists() {
        LinkedList testLL = new LinkedList();
        LinkedList testLL2 = new LinkedList();
        testLL2.insert(5);
        testLL2.append(6);
        testLL2.append(7);
        testLL2.append(8);
        LinkedList zippedList = new LinkedList();
        zippedList = zippedList.zipLists(testLL,testLL2);
        assertEquals("{5} -> {6} -> {7} -> {8} -> NULL",zippedList.toString());
    }
    @Test public void testZipVoidLists2() {
        LinkedList testLL = new LinkedList();
        testLL.append(1);
        testLL.append(2);
        testLL.append(3);
        testLL.append(4);
        LinkedList testLL2 = new LinkedList();
        LinkedList zippedList = new LinkedList();
        zippedList = zippedList.zipLists(testLL,testLL2);
        assertEquals("{1} -> {2} -> {3} -> {4} -> NULL",zippedList.toString());
    }
    @Test public void testZipListsNotEqualLength() {
        LinkedList testLL = new LinkedList();
        testLL.append(1);
        testLL.append(2);
        testLL.append(3);
        testLL.append(4);
        testLL.append(100);
        testLL.append(200);
        LinkedList testLL2 = new LinkedList();
        testLL2.insert(5);
        testLL2.append(6);
        testLL2.append(7);
        testLL2.append(8);
        LinkedList zippedList = new LinkedList();
        zippedList = zippedList.zipLists(testLL,testLL2);
        assertEquals("{1} -> {5} -> {2} -> {6} -> {3} -> {7} -> {4} -> {8} -> {100} -> {200} -> NULL",zippedList.toString());
    }
}
