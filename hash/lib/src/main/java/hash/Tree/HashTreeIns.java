package hash.Tree;

import hash.HashTable;

import java.util.ArrayList;
import java.util.List;

public class HashTreeIns<K, T> {
    public static void main(String[] args) {
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
        HashTreeIns test = new HashTreeIns();
        System.out.println(test.treeInsertion(a, b));
    }

    HashTable<K, T> hashTable = new HashTable<>(1024);

    public void preOrder(TreeNode root) {
        if (root != null) {
            hashTable.addToHashTable((K) root.value, (T) root.value);
        }
        if (root.left != null) {
            preOrder(root.left);
        }
        if (root.right != null) {
            preOrder(root.right);
        }
    }

    public void traverse(TreeNode root, List common) {
        if (root != null) {
            if (hashTable.contain((K) root.value)) {
                common.add(root.value);
            }
            if (root.left != null) {
                traverse(root.left, common);
            }
            if (root.right != null) {
                traverse(root.right, common);
            }
        }
    }

    public List treeInsertion(Tree a, Tree b) {
        List common = new ArrayList();
        preOrder(a.root);
        traverse(b.root, common);
        return common;
    }
}


