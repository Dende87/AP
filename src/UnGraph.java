
public class UnGraph  extends Graph{

	public UnGraph(int n) {
		super(n);
		
	}
	
	public boolean addEdge(int from, int to) {
		return super.addEdge(from, to) && super.addEdge(to, from);
	}
	
	public boolean removeEdge(int from, int to) {
		return super.removeEdge(from, to) && super.removeEdge(to, from);
	}

	public int countEdges() {
		return super.countEdges() / 2;
	}
}
