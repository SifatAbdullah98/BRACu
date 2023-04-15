package lab02;

import java.io.*;
import java.util.*;

public class Level_03 {

    int[][] graph;
    String[] color;
    int[] d_Time;
    int time;
    int vertices;
    int linas_positon;
    int[] participants;

    public static void main(String[] args) {

        Level_03 x = new Level_03();
        x.graphInput();
        x.dfs(x.linas_positon);
        x.lowest_move();

    }

    public void graphInput() {

        try {

            FileReader fr = new FileReader("G:\\Fall20\\CSE221(Algorithms)\\lab02\\input03.txt");
            BufferedReader obj = new BufferedReader(fr);

            vertices = Integer.parseInt(obj.readLine());

            int edge_number = Integer.parseInt(obj.readLine());

            graph = new int[vertices][vertices];

            for (int i = 0; i < edge_number; i++) {
                String str = obj.readLine();
                StringTokenizer st = new StringTokenizer(str, " ");
                int token1 = Integer.parseInt(st.nextToken());
                int token2 = Integer.parseInt(st.nextToken());
                graph[token2][token1] = 1;
            }

            linas_positon = Integer.parseInt(obj.readLine());
            participants = new int[Integer.parseInt(obj.readLine())];

            for (int i = 0; i < participants.length; i++) {
                participants[i] = Integer.parseInt(obj.readLine());
            }

        } catch (Exception e) {

        }

    }

    public void dfs(int start) {

        color = new String[vertices];
        d_Time = new int[vertices];

        for (int i = 0; i < vertices; i++) {
            color[i] = "white";
        }

        time = 0;

        if (color[start] == "white") {
            dfsVisit(start);
        }

    }

    public void dfsVisit(int u) {

        color[u] = "grey";
        time += 1;
        d_Time[u] = time;

        for (int v = 0; v < graph[u].length; v++) {
            if (graph[u][v] == 1) {
                if (color[v] == "white") {
                    dfsVisit(v);
                }
            }
        }
        color[u] = "black";
        time = time + 1;

    }

    public void lowest_move() {

        int lowest_dtime = d_Time[participants[0]];
        int position = 0;

        for (int i = 1; i < participants.length; i++) {
            if (lowest_dtime > d_Time[participants[i]]) {
                lowest_dtime = d_Time[participants[i]];
                position = participants[i];
            }
        }
        System.out.println("The winner is : " + position);
        System.out.println("Minimum number of moves :" + (d_Time[position] - 1));

    }

}
