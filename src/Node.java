import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Node {

    private String name;
    private Map<Node, Edge> nodes;
    private Node suffixLink;

    public Node(String name) {
        this.name = name;
        this.nodes = new HashMap<>();
    }

    public void connectTo(int from, int to, Node node) {
        this.nodes.put(node, new Edge(from, to, true));
    }

    public boolean containsEdge(int from, int to) {
        return this.nodes.containsValue(new Edge(from, to));
    }

    public Edge getEdge(Node node) {
        return this.nodes.get(node);
    }

    public Set<Node> getNodes() {
        return this.nodes.keySet();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getSuffixLink() {
        return suffixLink;
    }

    public void setSuffixLink(Node suffixLink) {
        this.suffixLink = suffixLink;
    }
}
