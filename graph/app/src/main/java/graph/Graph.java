package graph;


import java.util.*;

public class Graph<v> {
    HashMap<Node<v>, ArrayList<Node<v>>> graphElemnts1 = new HashMap<>();

    public Node<v> addNode(v value) {
        Node<v> newNode = new Node<>(value);
        ArrayList<Node<v>> linkedNodes = new ArrayList<>();
        graphElemnts1.put(newNode, linkedNodes);
        return newNode;
    }

    public void addEdge(Node<v> A, Node<v> B) {
//        System.out.println("typeOf A value is " + A.value.getClass().getSimpleName());
//        System.out.println(A.value);
//        System.out.println(graphElemnts1.containsKey(A));
        if (graphElemnts1.containsKey(A) && graphElemnts1.containsKey(B)) {
            graphElemnts1.get(A).add(B);
        }
    }

    public List<Node> getNodes() {
        return new ArrayList(graphElemnts1.keySet());
    }

    public List<Node<v>> getNeighbors(Node<v> A) {
        return graphElemnts1.get(A);
    }

    public int getSize() {
        return graphElemnts1.size();
    }

    public List<Node<v>> breadthFirst(Node a) {
        List<Node<v>> nodes = new ArrayList<>();
        Queue<Node<v>> breadth = new LinkedList<>();
        Set<Node<v>> visited = new HashSet<>();

        breadth.add(a);
        visited.add(a);
        while (!breadth.isEmpty()) {
            Node front = breadth.poll();
            nodes.add(front);
            if (this.getNeighbors(front).size()>0){
                for (Object neighbor : this.getNeighbors(front)) {
                    if (!visited.contains(neighbor)){
                        visited.add((Node<v>) neighbor);
                        breadth.add((Node<v>) neighbor);
                    }
                }
            }
        }
        return nodes;
    }
}

//
//    ALGORITHM BreadthFirst(vertex)
//    DECLARE nodes <-- new List()
//        DECLARE breadth <-- new Queue()
//        DECLARE visited <-- new Set()
//
//        breadth.Enqueue(vertex)
//        visited.Add(vertex)
//
//        while (breadth is not empty)
//        DECLARE front <-- breadth.Dequeue()
//        nodes.Add(front)
//
//        for each child in front.Children
//        if(child is not visited)
//        visited.Add(child)
//        breadth.Enqueue(child)
//
//        return nodes;
