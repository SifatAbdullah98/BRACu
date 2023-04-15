package lab02;

import java.io.*;
import java.util.*;

public class Level_04 {

    int[][] graph;
    int vertices;

    public static void main(String[] args) {

        Level_04 Nora = new Level_04();
        Nora.graphInput();
        Nora.suitablePlace();

    }

    public void graphInput() {

        try {

            String str;
            FileReader fr = new FileReader("G:\\Fall20\\CSE221(Algorithms)\\lab02\\input04.txt");
            BufferedReader obj = new BufferedReader(fr);

            vertices = Integer.parseInt(obj.readLine());

            graph = new int[vertices][vertices];

            int edge_number = Integer.parseInt(obj.readLine());

            for (int i = 0; i < edge_number; i++) {
                str = obj.readLine();
                StringTokenizer st = new StringTokenizer(str, " ");
                int token1 = Integer.parseInt(st.nextToken());
                int token2 = Integer.parseInt(st.nextToken());
                graph[token1][token2] = 1;
            }

        } catch (IOException e) {
            System.out.println("Exception!!!" + e);
        }

    }

    public void suitablePlace() {
        try {
            int[] indegree = new int[vertices];

            for (int i = 0; i < graph.length; i++) {
                for (int j = 0; j < graph[i].length; j++) {
                    indegree[i] += graph[j][i];
                }
            }

            int LowestIndegree = indegree[0];
            int LowestIndegree_position = 0;

            for (int i = 1; i < indegree.length; i++) {
                if (LowestIndegree > indegree[i]) {
                    LowestIndegree = indegree[i];
                    LowestIndegree_position = i;
                }
            }
            System.out.println("Suitable Position : " + LowestIndegree_position);

        } catch (Exception e) {
            System.out.println("Exception!!!" + e);
        }

    }

}