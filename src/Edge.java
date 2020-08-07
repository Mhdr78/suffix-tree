public class Edge {

    private int from;
    private int to;
    private boolean leaf;

    public Edge(int from, int to, boolean leaf) {
        this.from = from;
        this.to = to;
        this.leaf = leaf;
    }

    public Edge(int from, int to) {
        this.from = from;
        this.to = to;
        this.leaf = true;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = End.getEnd();
    }

    public boolean isLeaf() {
        return leaf;
    }

    public void setLeaf(boolean leaf) {
        this.leaf = leaf;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Edge) {
            return this.from == ((Edge) obj).from && this.to == ((Edge) obj).to;
        }
        return false;
    }
}

class End {
    private static int end = -1;

    public static void increment() {
        end += 1;
    }

    public static int getEnd() {
        return end;
    }
}
