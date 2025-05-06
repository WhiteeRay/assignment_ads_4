import java.util.Map;

public class Vertex<V> {
    private V data;
    private Map<Vertex<V>, Double> adjacentVertices;

    public void addAdjacementVertex(Vertex<V> destination, double weight){
        adjacentVertices.put(destination, weight);
    }

    public Vertex(V data) {
        this.data = data;
    }

    public V getData() {
        return data;
    }

    public void setData(V data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Vertex{" + "data=" + data + '}';
    }
}