package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Graph<v> {
//    ArrayList<Node<v>> graphElemnts = new ArrayList<>();
    HashMap <Node<v>, ArrayList<Node<v>>> graphElemnts1 = new HashMap<>();

    public Node<v> addNode(v value) {
        Node<v> newNode = new Node<>(value);

        ArrayList<Node<v>> linkedNodes =  new ArrayList<>();
        graphElemnts1.put(newNode,linkedNodes);

//        graphElemnts.add(newNode);
        return newNode;
    }

    public void addEdge(Node<v> A, Node<v> B) {
//        System.out.println("A "+graphElemnts.contains(A));
//        System.out.println("B "+graphElemnts.contains(B));
//        if (graphElemnts.contains(A) && graphElemnts.contains(B)) {
//            A.next = B;
//        }
        System.out.println("typeOf A value is " + A.value.getClass().getSimpleName());
        System.out.println(A.value);
        System.out.println(graphElemnts1.containsKey(A));
                if (graphElemnts1.containsKey(A) && graphElemnts1.containsKey(B)) {
                    graphElemnts1.get(A).add(B);
                }
    }

//    public ArrayList<Node<v>> getNodes() {
//        return graphElemnts;
//    }
    public List<Node> getNodes() {
//        List nodesList = ;
//        Set<Node> setOfKeys = graphElemnts1.keySet();

        return new ArrayList(graphElemnts1.keySet());
    }

    public List<Node<v>> getNeighbors (Node<v> A){
            return graphElemnts1.get(A);
    }

    public int getSize() {
        return graphElemnts1.size();
    }
}
