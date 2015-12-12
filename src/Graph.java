public class Graph {
	private int n;
	private boolean[][] adj;
	private int edgecount = 0;

	public Graph(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("n must not be less than 0.");
		}
		this.n = n;
		this.adj = new boolean[n][n];
	}

	private void checkVertex(int v) {
		if (v < 0 || v >= this.n) {
			throw new InvalidVertexException(v, this.n);
		}
	}

	public boolean hasEdge(int from, int to) {
		this.checkVertex(from);
		this.checkVertex(to);
		return this.adj[from][to];
	}

	public boolean addEdge(int from, int to) {
		this.checkVertex(from);
		this.checkVertex(to);
		if (!this.adj[from][to]) {
			this.adj[from][to] = true;
			this.edgecount++;
			return true;
		} else {
			return false;
		}
	}

	public boolean removeEdge(int from, int to) {
		this.checkVertex(from);
		this.checkVertex(to);
		if (this.adj[from][to]) {
			this.adj[from][to] = false;
			this.edgecount--;
			return true;
		} else {
			return false;
		}
	}

	public int countEdges() {
		return this.edgecount;
	}

	@Override
	public String toString() {
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < this.n; ++i) {
			for (int j = 0; j < this.n; ++j) {
				b.append(adj[i][j] ? '1' : '0');
				if (j < n - 1) {
					b.append(' ');
				}
			}
			b.append('\n');
		}
		return b.toString();
	}

	public static class InvalidVertexException extends IndexOutOfBoundsException {
		public InvalidVertexException(int v, int n) {
			super("Vertex number " + v + " is out of range [0," + (n - 1) + "]");
		}
	}
}