package trees;

import java.util.ArrayList;
import java.util.List;

public class NodeK {
    String value;
    List<NodeK >children;


    public NodeK(String value) {
        this.value = value;
        children=new ArrayList<NodeK>();
    }


}
