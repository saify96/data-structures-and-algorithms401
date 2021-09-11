/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hash;

import hash.Tree.HashTreeIns;
import hash.Tree.Tree;
import hash.Tree.TreeNode;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    //hashTable Tests
    @Test void hashTableTests() {
        HashTable hashTableTest = new HashTable(1024);
        hashTableTest.addToHashTable("Mohammad","Alsaify");
        hashTableTest.addToHashTable("Mohmmaad","Ahmad");
        assertEquals(316,hashTableTest.GetHash("Mohammad"));
        assertEquals("Alsaify",hashTableTest.tableArray[316].getValue());
        assertEquals("Alsaify",hashTableTest.get("Mohammad"));
        assertEquals("Ahmad",hashTableTest.get("Mohmmaad"));//collision
        assertEquals(true,hashTableTest.contain("Mohammad"));
        assertEquals(false,hashTableTest.contain("anas"));
        assertThrows(NoSuchElementException.class,() ->hashTableTest.get("anas"));
    }
    //repeatedWord Tests
    @Test void repeatedWordsTests() {
        RepeatedWord repeatedWordTest = new RepeatedWord();
        String test="Once upon a time, there was a brave princess who...";
        String test2 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        String test3 = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        String test4 = "";
        assertEquals("a",repeatedWordTest.repeatedWord(test));
        assertEquals("it",repeatedWordTest.repeatedWord(test2));
        assertEquals("summer",repeatedWordTest.repeatedWord(test3));
        assertEquals("There's no repeated word",repeatedWordTest.repeatedWord(test4));

    }
    //HashTreeInsertion Tests
    @Test void HashTreeInsertionTests() {
        HashTreeIns test = new HashTreeIns();
        Tree a = new Tree();
        a.root = new TreeNode(150);
        a.root.left = new TreeNode(100);
        a.root.left.left = new TreeNode(75);
        a.root.left.right = new TreeNode(160);
        a.root.left.right.left = new TreeNode(125);
        a.root.left.right.right = new TreeNode(175);
        a.root.right = new TreeNode(250);
        a.root.right.left = new TreeNode(200);
        a.root.right.right = new TreeNode(350);
        a.root.right.right.left = new TreeNode(300);
        a.root.right.right.right = new TreeNode(500);

        Tree b = new Tree();
        b.root = new TreeNode(42);
        b.root.left = new TreeNode(100);
        b.root.left.left = new TreeNode(15);
        b.root.left.right = new TreeNode(160);
        b.root.left.right.left = new TreeNode(125);
        b.root.left.right.right = new TreeNode(175);
        b.root.right = new TreeNode(600);
        b.root.right.left = new TreeNode(200);
        b.root.right.right = new TreeNode(350);
        b.root.right.right.left = new TreeNode(4);
        b.root.right.right.right = new TreeNode(500);

        assertEquals("[100, 160, 125, 175, 200, 350, 500]",test.treeInsertion(a,b).toString());

    }

    //hashTable Tests

}
