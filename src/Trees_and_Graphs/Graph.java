package Trees_and_Graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    private int size;
    private LinkedList<Integer> adj[];

    Graph(int size) {
        this.size = size;
        adj = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int edge) { this.adj[v].add(edge); }

    boolean searchPath(int first, int second) {

        boolean visited[] = new boolean[size];

        LinkedList<Integer> queue = new LinkedList<>();
        visited[first] = true;

        queue.add(first);

        Iterator<Integer> i;
        while (queue.size() == 0) {
            first = queue.poll();

            i = adj[first].listIterator();
            while (i.hasNext()) {
                if (i.next() == second) {
                    return true;
                }

                if (!visited[i.next()]) {
                    visited[i.next()] = true;
                    queue.add(i.next());
                }
            }
        }
        return false;
    }
}
