package trees;

public class Tree {
    Node root;
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

        System.out.println(preOrder(A));
        System.out.println("----------");
        System.out.println(inOrder(A));
        System.out.println("----------");
        System.out.println(postOrder(A));
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
}

