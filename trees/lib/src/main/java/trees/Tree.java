package trees;

import queues.Queue;

import java.util.ArrayList;
import java.util.Collections;

public class Tree<T> {
    static ArrayList<Integer> values = new ArrayList();
    ArrayList<T> breadthTree = new ArrayList();
    Queue<Node> queue = new Queue();
    static Node root;
    static String preOrderString = "";
    static String inOrderString = "";
    static String postOrderString = "";

    public static void main(String[] args) {
        Node F = new Node("F");
        Node E = new Node("E");
        Node D = new Node("D");
        Node C = new Node(null, F, "C");
        Node B = new Node(E, D, "B");
        Node A = new Node(C, B, "A");

//        System.out.println(preOrder(A));
//        System.out.println("----------");
//        System.out.println(inOrder(A));
//        System.out.println("----------");
//        System.out.println(postOrder(A));

        Tree tree = new Tree();
        tree.root = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left = new Node(45);
        tree.root.right.left = new Node(44);
        tree.root.left.right = new Node(50);
        tree.root.left.left = new Node(6);
//        System.out.println(findValues(tree.root));
//        System.out.println("------------");
//        System.out.println(tree.findMax());
        System.out.println(tree.breadthFirst(tree));

    }

    public static String preOrder(Node root) {
        if (root != null) {
            preOrderString += root.value + " -> ";
//            System.out.println(root.value);
        }
        if (root.left != null) {
            preOrder(root.left);
        }
        if (root.right != null) {
            preOrder(root.right);
        }
        return preOrderString;
    }

    public static String inOrder(Node root) {
        if (root != null)
            if (root.left != null) {
                inOrder(root.left);
            }
        inOrderString += root.value + " -> ";
//        System.out.println(root.value);
        if (root.right != null) {
            inOrder(root.right);
        }
        return inOrderString;
    }

    public static String postOrder(Node root) {
        if (root != null)
            if (root.left != null) {
                postOrder(root.left);
            }
        if (root.right != null) {
            postOrder(root.right);
        }
        postOrderString += root.value + " -> ";
//        System.out.println(root.value);
        return postOrderString;
    }

    public static ArrayList findValues(Node root) {
        if (root != null) {
            values.add((Integer) root.value);
        }
        if (root.left != null) {
            findValues(root.left);
        }
        if (root.right != null) {
            findValues(root.right);
        }
        return values;
    }

    public Integer findMax() {
        findValues(this.root);
        return Collections.max(values);
    }

    public ArrayList breadthFirst(Tree<T> tree) {
        if (tree.root == null) {
            System.out.println("empty tree");
            return breadthTree;
        } else {
            queue.Enqueue(tree.root);
        }
        while (!queue.isEmpty()) {
            if (queue.peek().left != null) {
                queue.Enqueue(queue.peek().left);
            }
            if (queue.peek().right != null) {
                queue.Enqueue(queue.peek().right);
            }
            breadthTree.add((T) queue.dequeue().value);
        }
        return breadthTree;
    }
}

