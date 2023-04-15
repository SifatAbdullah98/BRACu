package lab02;

import java.io.*;
import java.util.*;

public class Level_01 {

    int vertices;
    int graph[][];
    int lenas_position;

    public static void main(String[] args) {

        Level_01 Nora = new Level_01();
        Nora.graphInput();
        Nora.bfs(0);

    }

    public void graphInput() {

        try {

            FileReader fr = new FileReader("G:\\Fall20\\CSE221(Algorithms)\\lab02\\input01.txt");
            BufferedReader obj = new BufferedReader(fr);

            vertices = Integer.parseInt(obj.readLine());

            graph = new int[vertices][vertices];

            int edge_number = Integer.parseInt(obj.readLine());

            for (int i = 0; i < edge_number; i++) {
                String str = obj.readLine();
                StringTokenizer st = new StringTokenizer(str, " ");
                int token1 = Integer.parseInt(st.nextToken());
                int token2 = Integer.parseInt(st.nextToken());
                graph[token1][token2] = 1;
                graph[token2][token1] = 1;
            }

            lenas_position = Integer.parseInt(obj.readLine());

        } catch (IOException e) {
            System.out.println("Exception!!!" + e);
        }

    }

    public void bfs(int start) {

        String[] color = new String[vertices];
        int[] distance = new int[vertices];
        int[] parents = new int[vertices];

        Queue<Integer> q = new LinkedList<Integer>();

        for (int i = 0; i < vertices; i++) {
            color[i] = "white";
            distance[i] = 9999999;
            parents[i] = -1;
        }

        color[start] = "grey";
        distance[start] = 0;
        parents[start] = -1;

        q.add(start);

        while (q.isEmpty() == false) {
            int u = q.poll();
            for (int v = 0; v < graph[u].length; v++) {
                if (graph[u][v] == 1 && color[v] == "white") {
                        color[v] = "grey";
                        distance[v] = distance[u] + 1;
                        parents[v] = u;
                        q.add(v);
                }
            }
            color[u] = "black";
        }

        System.out.println("Minimum number of moves : " + distance[lenas_position]);
    }

}