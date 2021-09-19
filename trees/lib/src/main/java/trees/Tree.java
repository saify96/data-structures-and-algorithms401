package trees;

import queues.Queue;

import java.util.ArrayList;
import java.util.Collections;

public class Tree<T> {
    static int sum = 0;
    static int sumOfLeftNodes = 0;
    static int sumOfRightNodes = 0;
    static int sumOfleaves = 0;
    static int countOfleaves = 0;
    static int maximum = Integer.MIN_VALUE;


    static Integer min1 = Integer.MAX_VALUE;
    static Integer min2 = Integer.MAX_VALUE;

    static Integer max1 = Integer.MIN_VALUE;
    static Integer max2 = Integer.MIN_VALUE;


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

        Tree tree = new Tree();
        tree.root = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left = new Node(45);
        tree.root.right.left = new Node(44);
        tree.root.right.right = new Node(5);
        tree.root.left.right = new Node(50);
        tree.root.left.left = new Node(6);
        tree.root.left.left.left = new Node(7);
        tree.root.left.left.left.right = new Node(20);
//        System.out.println(findValues(tree.root));
//        System.out.println("------------");
//        System.out.println(tree.findMax());
//        System.out.println(tree.breadthFirst(tree));
//        System.out.println(tree.findLevel(tree.root, tree.root.left.left.left.right, 1, 0));
//
//        printLevel(tree.root, tree.root.right.left, 3);

//        ArrayList orderdList = new ArrayList();
//        orderdList.add(1);
//        orderdList.add(2);
//        orderdList.add(3);
//        orderdList.add(4);
//        orderdList.add(5);
//        tree.listToTree(orderdList);

//        System.out.println(firstLeftNode(tree.root));
//        System.out.println(rightNodesSum(tree.root));
//        rightLeafSum(tree.root);
//        System.out.println(sum);
//        System.out.println(leftNodesSum(tree.root));
//        sumOfleaves(tree.root);
//        System.out.println(sumOfleaves);
//        System.out.println(countOfleaves);
//        second(tree.root);
////        System.out.println(min1);
        System.out.println("second min " + min2);
        secondMax(tree.root);
        System.out.println(max2);
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


//    public ArrayList breadthFirst(Tree<T> tree) {
//        if (tree.root == null) {
//            System.out.println("empty tree");
//            return breadthTree;
//        } else {
//            queue.Enqueue(tree.root);
//        }
//        while (!queue.isEmpty()) {
//            if (queue.peek().left != null) {
//                queue.Enqueue(queue.peek().left);
//            }
//            if (queue.peek().right != null) {
//                queue.Enqueue(queue.peek().right);
//            }
//            breadthTree.add((T) queue.dequeue().value);
//        }
//        return breadthTree;
//    }


//    public static void printLevel(Node root, Node node, int level) {
//        // base case
//        if (root == null) {
//            return;
//        }
//        // print cousins
//        if (level == 1) {
//            System.out.print(root.value + " ");
//            return;
//        }
//        // recur for the left and right subtree if the given node
//        // is not a child of the root
//        if (!(root.left != null && root.left == node ||
//                root.right != null && root.right == node)) {
//            printLevel(root.left, node, level - 1);
//            printLevel(root.right, node, level - 1);
//        }
//    }


//    public static int rightNodesSum ( Node root)    {
//        if (root==null){
//            System.out.println("empty");
//            return 0;
//        }
//        ArrayList list = new ArrayList();
//        int sum = 0;
//        helper(root.right, list);
//        for (Object o : list) {
//            sum+=(int)o;
//        }
//        return sum;
//
//
//    }
//    public static void  helper(Node root,ArrayList list) {
//        if (root != null) {
////            sum+=(int)root.value;
//            list.add((int)root.value);
//            if (root.left != null) {
//                sumLeftNodes(root.left,list);
//            }
//            if (root.right != null) {
//                sumLeftNodes(root.right,list);
//            }
//        }
//    }



//    public List<Integer> rightSideView(TreeNode root) {
//        List<Integer> res = new ArrayList<Integer>();
//        if(root == null) return res;
//        visitLevel(root, 1, res);
//        return res;
//    }
//    public void visitLevel(TreeNode root, int level, List<Integer> res){
//        if(root == null) return;
//        if(level > res.size()){
//            res.add(root.val);
//        }
//        visitLevel(root.right, level+1, res);
//        visitLevel(root.left, level+1, res);
//    }

//    public static Integer helperForSec(Node root){
//
//        second(root);
//        return min2;
//
//    }


    /// traverse
    public static String preOrder(Node root) {
        if (root != null) {
            preOrderString += root.value + " -> ";
            preOrder(root.left);
            preOrder(root.right);
        }
        return preOrderString;
    }

    public static String inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            inOrderString += root.value + " -> ";
            inOrder(root.right);
        }
        return inOrderString;
    }

    public static String postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            postOrderString += root.value + " -> ";
        }
        return postOrderString;
    }

    public ArrayList breadthFirst(Tree<T> tree) {
        ArrayList<T> list = new ArrayList<>();
        Queue<Node> queue = new Queue<>();
        if (tree.root == null) {
            System.out.println("the tree is empty");
            return list;
        } else {
            queue.Enqueue(this.root);
        }
        while (!queue.isEmpty()) {
            Node front = queue.dequeue();
            list.add((T) front.value);
            if (front.left != null) {
                queue.Enqueue(front.left);
            }
            if (front.right != null) {
                queue.Enqueue(front.right);
            }
        }
        return list;
    }

    /// 1- isSymmetric *without values
    public static boolean isSymmetricHelper(Node root) {
        if (root == null) {
            return false;
        }
        return isSymmetric(root.left, root.right);
    }

    public static boolean isSymmetric(Node left, Node right) {
        if (left == null && right == null) {
            return true;
        }
        return (left != null && right != null) && isSymmetric(left.left, right.right)
                && isSymmetric(left.right, right.left);
    }

    // 2- identical
    public static boolean isIdentical(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        return (root1 != null && root2 != null) && (root1.value == root2.value) && isIdentical(root1.left, root2.left)
                && isIdentical(root1.right, root2.right);
    }

    // 3- merge two trees
    public Node mergeTrees(Node tree1, Node tree2) {
        if (tree1 == null)
            return tree2;
        if (tree2 == null)
            return tree1;
//        Node t3 = new Node(t1.v+t2.v);
        tree1.value += tree2.value;
        tree1.left = mergeTrees(tree1.left, tree2.left);
//        tree1.left = mergeTrees(tree1.left, tree2.left,t3.left);
        tree1.right = mergeTrees(tree1.right, tree2.right);
//        tree1.right = mergeTrees(tree1.right, tree2.right,t3.right);
        return tree1;
    }
//    public Node mergeTree(Node tree1, Node tree2) {
//        Node newNode ;
//        return mergeTrees(tree1,tree2,tree3);
//    }



        // 4- secondMaximum
    //declare maximum1 and maximum2
    public static void secondMax(Node root) {
        if (root != null) {
            if ((Integer) root.value > max1) {
                max2 = max1;
                max1 = (Integer) root.value;
            } else if ((Integer) root.value > max2) {
                max2 = (Integer) root.value;
            }
            secondMax(root.left);
            secondMax(root.right);
        }
    }

    // 5- secondMinimum
    //declare minimum1 and minimum2
    public static void secondMin(Node root) {
        if (root != null) {
            if ((Integer) root.value < min1) {
                min2 = min1;
                min1 = (Integer) root.value;
            } else if ((Integer) root.value < min2) {
                min2 = (Integer) root.value;
            }
            secondMin(root.left);
            secondMin(root.right);
        }
    }

    // 6- Convert sorted list to binary search tree
    // if the given list is LinkedList we will convert it to ArrayList
    public Node listToTree(ArrayList list) {
        if (list.size() == 0) {
            return null;
        }
        return listToTreeHelper(list, 0, list.size() - 1);
    }

    public Node listToTreeHelper(ArrayList list, int low, int high) {
        if (low > high) {
            return null;
        }
        int mid = low + (high - low) / 2;
        Node node = new Node(list.get(mid));
        node.right = listToTreeHelper(list, mid + 1, high);
        node.left = listToTreeHelper(list, low, mid - 1);
        return node;
    }

    // 7- sumOfLeaves && countOfLeaves
    //declare sumOfLeaves and countOfLeaves variables
    static void sumOfLeaves(Node root) {
        if (root == null)
            return;
        if (root.right == null && root.left == null) {
            sumOfleaves += (int) root.value;
            countOfleaves++;
        }
        sumOfLeaves(root.left);
        sumOfLeaves(root.right);
    }

    // 8- sumOfRightLeaves
    //declare sumOfRightLeaves
    static void rightLeavesSum(Node root) {
        if (root == null)
            return;
        if (root.right != null)
            if (root.right.left == null && root.right.right == null)
                sum += (int) root.right.value;
        rightLeavesSum(root.left);
        rightLeavesSum(root.right);
    }

    // 9- sumOfLeftLeaves
    //declare sumOfLeftLeaves
    static void leftLeavesSum(Node root) {
        if (root == null)
            return;
        if (root.left != null)
            if (root.left.left == null && root.left.right == null)
                sum += (int) root.right.value;
        leftLeavesSum(root.left);
        leftLeavesSum(root.right);
    }

    // 10- sumOfLeftNodes
    //declare sumOfLeftNodes
    static int leftNodesSum(Node root) {
        if (root == null)
            return 0;
        if (root.left != null) {
            sumOfLeftNodes += (int) root.left.value;
        }
        leftNodesSum(root.right);
        leftNodesSum(root.left);
        return sumOfLeftNodes;
    }

    // 11- sumOfRightNodes
    //declare sumOfRightNodes
    static int rightNodesSum(Node root) {
        if (root == null)
            return 0;
        if (root.right != null) {
            sumOfRightNodes += (int) root.right.value;
        }
        rightNodesSum(root.right);
        rightNodesSum(root.left);
        return sumOfRightNodes;
    }

    // 12- MaximumValue
    // declare maximum variable
    public static int maximumValue(Node root) {
        if (root != null) {
            if (root.value > maximum) {
                maximum = root.value;
            }
            maximumValue(root.left);
            maximumValue(root.right);
        }
        return maximum;
    }

    //   Function to print all cousins of a given node
    //    public static void printAllCousins(Node root, Node node)
    //    {
    //        // find the level of the given node
    //        int level = findLevel(root, node, 1, 0);
    //
    //        // print all cousins of a given node using its level number
    //        printLevel(root, node, level);
    //    }

    // 13- find level for a node
    public static int findLevel(Node root, Node x, int index, int level) {
        // return if the tree is empty or level is already found
        if (root == null || level != 0) {
            return level;
        }
        // if the given node is found, update its level
        if (root == x) {
            level = index;
        }
        // recur for the left and right subtree
        level = findLevel(root.left, x, index + 1, level);
        level = findLevel(root.right, x, index + 1, level);

        return level;
    }

    // 14- Function to print all cousins of a given node
    public static void printLevel(Node root, Node node, int level) {
        // base case
        if (root == null) {
            return;
        }
        // print cousins
        if (level == 1) {
            System.out.print(root.value + " ");
            return;
        }
        // recur for the left and right subtree if the given node
        // is not a child of the root
        if (!(root.left != null && root.left == node || root.right != null && root.right == node)) {
            printLevel(root.left, node, level - 1);
            printLevel(root.right, node, level - 1);
        }
    }

    // 15 - isSubtree
    public boolean isSubtree(Node<T> s, Node<T> t) {
        if (s == null || t == null) {
            return false;
        }
        StringBuilder res = new StringBuilder();
        serialize(s, res);
        StringBuilder res1 = new StringBuilder();
        serialize(t, res1);
        return res.toString().contains(res1.toString());
    }

    private void serialize(Node<T> cur, StringBuilder res) {
        if (cur != null) {
            res.append("," + cur.value);
            serialize(cur.left, res);
            serialize(cur.right, res);
        }
    }

}

//public class Solution {
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> res = new ArrayList<>();
//        if (root == null) return res;
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//        while (!queue.isEmpty()) {
//            List<Integer> level = new ArrayList<>();
//            int cnt = queue.size();
//            for (int i = 0; i < cnt; i++) {
//                TreeNode node = queue.poll();
//                level.add(node.val);
//                if (node.left != null) {
//                    queue.add(node.left);
//                }
//                if (node.right != null) {
//                    queue.add(node.right);
//                }
//            }
//            res.add(level);
//        }
//        return res;
//
//    }
//}
