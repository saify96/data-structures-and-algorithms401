package trees;

public class BinarySearchTree<T extends Comparable<T>> extends Tree {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new Node(20);
        tree.root.right = new Node(25);
        tree.root.left = new Node(15);
        tree.root.right.left = new Node(22);
        tree.root.left.right = new Node(19);
        tree.root.left.left = new Node(10);
        tree.Add(19);
        System.out.println(tree.contains(15));
        System.out.println(tree.inOrder(tree.root));
    }

    public void Add(T value) {
        Node current = root;
        Node<T> newNode = new Node(value);
        if (current == null) {
            root = newNode;
        } else {
            while (true) {
                if (current.value.compareTo(value) == 0) {
                    System.out.println("The Value is already exist");
                    break;
                }
                if (current.value.compareTo(value) < 0) {
                    if (current.right != null) {
                        current = current.right;
                        continue;
                    } else {
                        current.right = newNode;
                        break;
                    }
                }
                if (current.value.compareTo(value) > 0) {
                    if (current.left != null) {
                        current = current.left;
                        continue;
                    } else {
                        current.left = newNode;
                        break;
                    }
                }
            }
        }
    }

    public boolean contains(T value) {
        Node current = root;
        while (true) {
            if (current.value.compareTo(value) < 0) {
                if (current.right != null) {
                    current = current.right;
                    continue;
                } else {
                    return false;
                }
            }
            if (current.value.compareTo(value) > 0) {
                if (current.left != null) {
                    current = current.left;
                    continue;
                } else {
                    return false;
                }
            }
            if (current.value.compareTo(value) == 0) {
                return true;
            }
        }
//        return false;
    }
//public boolean contains(T value) {
//    Node current = root;
//    while (current.right.value != value && current.left.value != value) {
//        if (current.value.compareTo(value) < 0) {
//            if (current.right != null) {
//                current = current.right;
//                continue;
//            } else {
//                return false;
//            }
//        }
//        if (current.value.compareTo(value) > 0) {
//            if (current.left != null) {
//                current = current.left;
//                continue;
//            } else {
//                return false;
//            }
//        }
//        if (current.value.compareTo(value) == 0) {
//            return true;
//        }
//    }
//    return false;
//}


}


//    public boolean contain(T value){
//        Node current = root;
//
//        if current  .value == value
//        reurn true
//        if current.value > value
//        return contain(current.left, value);
//        if current.value < value
//        return contain(current.right, value);
//    }

//    public boolean contains(int value) {
//        return recursiveContains(this.root, value);
//    }
//
//    private boolean recursiveContains(Node<Integer> current, int value) {
//        if (current == null) {
//            return false;
//        }
//        if (value == current.value) {
//            return true;
//        }
//        if (value < current.value) {
//            return recursiveContains(current.left, value);
//        } else {
//            return recursiveContains(current.right, value);
//        }
//    }
//


