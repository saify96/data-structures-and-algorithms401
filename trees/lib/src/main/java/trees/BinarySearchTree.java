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
        tree.Add(23);
        System.out.println(tree.contains(27));
        tree.inOrder(tree.root);
    }

    public void Add(T value) {
        Node current = root;
        Node<T> newNode = new Node(value);
        if (current == null) {
            root = newNode;
        } else {
            while (current.right != newNode && current.left != newNode) {
                if (current.value.compareTo(newNode.value) < 0) {
                    if (current.right != null) {
                        current = current.right;
                        continue;
                    } else {
                        current.right = newNode;
                        break;
                    }
                }
                if (current.value.compareTo(newNode.value) > 0) {
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
        Node<T> newNode = new Node(value);
        while (current.right != newNode && current.left != newNode) {
            if (current.value.compareTo(newNode.value) < 0) {
                if (current.right != null) {
                    current = current.right;
                    continue;
                } else {
                    return false;
                }
            }
            if (current.value.compareTo(newNode.value) > 0) {
                if (current.left != null) {
                    current = current.left;
                    continue;
                } else {
                    return false;
                }
            }
            if (current.value.compareTo(newNode.value) == 0) {
                return true;
            }
        }
        return false;
    }

}
//    public void Add(T value) {
//        Node<T> newNode = new Node(value);
//        Node current = root;
////        Node current = new Node()
//        while (current != null) {
//            if (current.value.compareTo(newNode.value) < 0) {
//                if (current.right == null) {
//                    current.right = newNode;
//                    break;
//                } else {
//                    current = current.right;
//                    continue;
//                }
//            } else if (current.value.compareTo(newNode.value) == 0) {
//                System.out.println("already exist");
//                break;
//            } else {
//                if (current.left == null) {
//                    current.left = newNode;
//                    break;
//                } else {
//                    current = current.left;
//                    continue;
//                }
//            }
//        }
//    }
//
//    public boolean contains(T value) {
//        Node newNode = new Node(value);
//        Node current = root;
//        while (current != null) {
//            if (current.value.compareTo(newNode.value) < 0) {
//                if (current.right == null) {
//                    return false;
//                } else {
//                    current = current.right;
//                    continue;
//                }
//            } else if (current.value.compareTo(newNode.value) == 0) {
//                return true;
//            } else {
//                if (current.left == null) {
//                    return false;
//                } else {
//                    current = current.left;
//                    continue;
//                }
//            }
//        }
//        return false;
//    }