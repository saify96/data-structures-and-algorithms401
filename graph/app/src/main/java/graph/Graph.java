package graph;

import java.util.*;

public class Graph<v> {
    HashMap<Node<v>, HashMap<Node<v>, Double>> graphElemnts1 = new HashMap<>();

    public Node<v> addNode(v value) {
        Node<v> newNode = new Node<>(value);
//        ArrayList<Node<v>> linkedNodes = new ArrayList<>();
        HashMap<Node<v>, Double> valueHashMap = new HashMap<>();
        graphElemnts1.put(newNode, valueHashMap);
        return newNode;
    }

    public void addEdge(Node<v> A, Node<v> B) {
        if (graphElemnts1.containsKey(A) && graphElemnts1.containsKey(B)) {
//            graphElemnts1.get(A).add(B);
            graphElemnts1.get(A).put(B, null);
//            graphElemnts1.get(B).put(A,null);
        }
    }

    public void addEdge(Node<v> A, Node<v> B, Double w) {
        if (graphElemnts1.containsKey(A) && graphElemnts1.containsKey(B)) {
//            graphElemnts1.get(A).add(B);
            graphElemnts1.get(A).put(B, w);
        }
    }

    public List<Node> getNodes() {
        return new ArrayList(graphElemnts1.keySet());
    }

    public List<Node<v>> getNeighbors(Node<v> A) {
//        return graphElemnts1.get(A).keySet();
        return new ArrayList<>(graphElemnts1.get(A).keySet());
    }

    public int getSize() {
        return graphElemnts1.size();
    }

    public List<Node<v>> breadthFirst(Node<v> a) {
        List<Node<v>> nodes = new ArrayList<>();
        Queue<Node<v>> breadth = new LinkedList<>();
        Set<Node<v>> visited = new HashSet<>();

        breadth.add(a);
        visited.add(a);
        while (!breadth.isEmpty()) {
            Node<v> front = breadth.remove();
            nodes.add(front);
            if (this.getNeighbors(front).size() > 0) {
                for (Object neighbor : this.getNeighbors(front)) {
                    if (!visited.contains(neighbor)) {
                        visited.add((Node<v>) neighbor);
                        breadth.add((Node<v>) neighbor);
                    }
                }
            }
        }
        return nodes;
    }

    public String businessTrip(Graph graph, List<Node<v>> citiesName) {
        Double cost = 0.0;
        boolean flag = false;
        for (int i = 0; i < citiesName.size() - 1; i++) {
            if (graph.graphElemnts1.containsKey(citiesName.get(i)) && this.graphElemnts1.get(citiesName.get(i)).containsKey(citiesName.get(i + 1))) {
                flag = true;
                cost += this.graphElemnts1.get(citiesName.get(i)).get(citiesName.get(i + 1));
            }
        }
        String result = flag + ", $" + cost;
        return result;
    }
}