import java.util.Map;

public class Vertex<T> {
    private T data;
    private Map<Vertex<T>, Double> adjacentVertices;
    public Vertex(T data){
        this.data = data;
    }
    public void addAdjacent(Vertex<T> vertex, Double weight){
        adjacentVertices.put(vertex, weight);
    }
    public double getWeight(Vertex<T> vertex){
        return adjacentVertices.get(vertex);
    }
    public void removeAdjacent(Vertex<T> vertex){
        adjacentVertices.remove(vertex);
    }

}
