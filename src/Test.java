public class Test {

    public static void main(String[] args) {
        Node root = new Node("root");
        Node node1 = new Node("node1");
        root.connectTo(0, 2, node1);
        String string = "abcabxabcd";
        Edge edge = root.getEdge(node1);
        System.out.println(string.substring(edge.getFrom(), edge.getTo()));
//        System.out.println(End.getEnd());
//        End.increment();
//        System.out.println(End.getEnd());
//        System.out.println(edge.equals(new Edge(0, 2)));
    }
}
