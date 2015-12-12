
public class TestGraph {

	public static void main(String[] args) {
		UnGraph g = new UnGraph(5);
		g.addEdge(0, 1);
		g.addEdge(1, 3);
		g.addEdge(2, 1);
		g.addEdge(2, 4);
		g.addEdge(3, 4);
		System.out.println(g.countEdges() + "\n" + g.toString());
		try {
			g.removeEdge(5, 5);
		} catch (Graph.InvalidVertexException e) {
			System.out.println(e);
		}
	}

}
