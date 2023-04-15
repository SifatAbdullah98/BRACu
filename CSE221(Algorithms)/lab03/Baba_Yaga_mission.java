import java.io.*;
import java.util.*;

public class Baba_Yaga_mission {

    static int numOf_country;
    static int numOF_flight;
    static int locationOf_cHotel;
    static int numberOf_mission;
    static int v;
    static int graph[][];
    static int[] start;
    static int[] end;
    static int distance[];
    static int[] parent;
    static boolean[] visited;

    public static void main(String[] args) {
        Graph();
        Djk(graph, start[0]);
        int x = print(locationOf_cHotel);
        //System.out.println(x);
        Djk(graph, locationOf_cHotel);
        int y = print(end[0]);
        //System.out.println(y);
        System.out.println(x + y);
        Djk(graph, start[1]);
        int j = print(locationOf_cHotel);
        Djk(graph, locationOf_cHotel);
        int k = print(end[1]);
        System.out.println(j + k);

    }

    public static void Graph() {
        try {
            String str;
            FileReader fr = new FileReader("G:\\Fall20\\CSE221(Algorithms)\\lab03\\input01.txt");
            BufferedReader obj = new BufferedReader(fr);
            str = obj.readLine();
            StringTokenizer s = new StringTokenizer(str, " ");
            numOf_country = Integer.parseInt(s.nextToken());
            numOF_flight = Integer.parseInt(s.nextToken());
            locationOf_cHotel = Integer.parseInt(s.nextToken());
            numberOf_mission = Integer.parseInt(s.nextToken());
            v = numOf_country;
            graph = new int[v + 1][v + 1];
            start = new int[numberOf_mission];
            end = new int[numberOf_mission];
            for (int i = 0; i < graph.length - 1; i++) {
                str = obj.readLine();
                StringTokenizer st = new StringTokenizer(str, " ");
                int token1 = Integer.parseInt(st.nextToken());
                int token2 = Integer.parseInt(st.nextToken());
                int weidth = Integer.parseInt(st.nextToken());
                graph[token1][token2] = weidth;
            }
            for (int i = 0; i < numberOf_mission; i++) {
                str = obj.readLine();
                StringTokenizer st = new StringTokenizer(str, " ");
                int tempstart = Integer.parseInt(st.nextToken());
                int tempend = Integer.parseInt(st.nextToken());
                start[i] = tempstart;
                end[i] = tempend;
            }

        } catch (IOException e) {
            System.out.println("Exception!!!");
        }
    }

    public static void Djk(int[][] adjacencyMatrix, int start) {
        visited = new boolean[adjacencyMatrix.length];
        distance = new int[adjacencyMatrix.length];
        for (int i = 0; i < distance.length; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        distance[start] = 0;
        int minVertex = start;
        for (int i = 0; i < adjacencyMatrix.length - 1; i++) {
            visited[minVertex] = true;
            for (int j = 0; j < adjacencyMatrix.length; j++) {
                if (adjacencyMatrix[minVertex][j] != 0 && !visited[j] && distance[minVertex] != Integer.MAX_VALUE) {
                    int newDistance = distance[minVertex] + adjacencyMatrix[minVertex][j];
                    if (newDistance < distance[j]) {
                        distance[j] = newDistance;
                    }
                }
            }
            minVertex = findMinVertex(distance, visited);

        }
    }

    public static int findMinVertex(int weight[], boolean[] visited) {
        int minVertex = -1;
        for (int i = 0; i < weight.length; i++) {
            if (!visited[i] && (minVertex == -1 || weight[i] < weight[minVertex])) {
                minVertex = i;
            }
        }
        return minVertex;
    }

    public static int print(int end) {
        return distance[end];
    }
}