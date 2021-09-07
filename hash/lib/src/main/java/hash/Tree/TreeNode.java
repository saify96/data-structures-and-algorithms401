package hash.Tree;

public class TreeNode<T> {
    public TreeNode<T> right;
    public TreeNode<T> left;
    T value;

    public TreeNode(T value) {
        this.value = value;
    }

    public TreeNode(TreeNode<T> right, TreeNode<T> left, T value) {
        this.right = right;
        this.left = left;
        this.value = value;
    }
}
