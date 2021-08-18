package trees;

import java.util.ArrayList;
import java.util.List;

public class NodeK <T>{
    private List<NodeK <T>>children = new ArrayList<>();
    private T value;
    private int k ;

    public NodeK(){}

    public NodeK(T value, int k) {
        this.value = value;
        this.k=k;
    }

    public NodeK<T> addChild(T key) {
        NodeK<T> newNode = new NodeK<T>(value, k);
        if (children.size() < k) {
            children.add(newNode);
            return newNode;
        }
        return null;
    }

}
