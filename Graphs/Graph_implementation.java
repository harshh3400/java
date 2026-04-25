import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph_implementation {
  static class Edge {
    int src;
    int dest;
    int weight;

    Edge(int s, int d, int w) {
      this.src = s;
      this.dest = d;
      this.weight = w;
    }
  }

  public static void bfs(ArrayList<Edge>[] graph) {
    Queue<Integer> q = new LinkedList<>();
    boolean vis[] = new boolean[graph.length];
    q.add(0);
    while (!q.isEmpty()) {
      int curr = q.remove();
      if (!vis[curr]) {
        System.out.print(curr + " ");
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
          Edge e = graph[curr].get(i);
          q.add(e.dest);
        }
      }
    }

  }

  public static void dfs(ArrayList<Edge>[] graph, int curr, boolean vis[]) {
    System.out.print(curr + " ");
    vis[curr] = true;
    for (int i = 0; i < graph[curr].size(); i++) {
      Edge e = graph[curr].get(i);
      if (!vis[e.dest]) {
        dfs(graph, e.dest, vis);
      }
    }

  }

  public static void createGraph(ArrayList<Edge>[] graph) {
    int V = 5;
    for (int i = 0; i < V; i++) {
      graph[i] = new ArrayList<>();
    }
    // Adding edges
    graph[0].add(new Edge(0, 1, 10));
    graph[0].add(new Edge(0, 2, 15));
    graph[1].add(new Edge(1, 3, 12));
    graph[2].add(new Edge(2, 4, 10));
    graph[3].add(new Edge(3, 4, 5));

    for (int i = 0; i < graph[0].size(); i++) {
      Edge e = graph[0].get(i);
      System.out.println("Edge from " + e.src + " to " + e.dest + " with weight " + e.weight);
    }
  }

  public static void main(String[] args) {
    int V = 5;
    ArrayList<Edge>[] graph = new ArrayList[V];

    createGraph(graph);
    // bfs(graph);
    dfs(graph, 0, new boolean[V]);
  }
}
