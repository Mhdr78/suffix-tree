public class SuffixTree {

    private Node root;

    public SuffixTree(String string) {
        this.root = new Node("root");
        int remaining = 0;
        Node activeNode = this.root;
        int activeEdge = -1;
        int activeLength = 0;
        int counter = 1;

        for (int i = 0; i < string.length(); i++) {
            End.increment();
            remaining++;

            if (activeNode.containsEdge(i, End.getEnd())) {
                // TODO change the active point for existing edge
                activeEdge = i;
                activeLength++;
            } else {
                // TODO add the edge to appropriate node
                Node node = new Node("node" + counter);
//                activeNode.connectTo();
            }
        }
    }


}
