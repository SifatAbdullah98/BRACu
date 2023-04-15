package lab02;

import java.io.*;
import java.util.*;

public class Level_02 {

    int v;
    int graph[][];
    int StartNora = 0;
    int end = 0;
    int StartLara = 0;


    public static void main(String[] args) {

        Level_02 x = new Level_02();
        x.GraphInput();
        int lara = x.bfs(x.StartLara, x.end);
        int nora = x.bfs(x.StartLara, x.end);
        
        if (lara < nora) {
            System.out.println("Lara  goes to position first");
        } else {
            System.out.println("Nora  goes to position first");
        }

        
    }

    public void GraphInput() {
        try {
            String str;
            FileReader fr = new FileReader("G:\\Fall20\\CSE221(Algorithms)\\lab02\\input02.txt");
            BufferedReader obj = new BufferedReader(fr);     
            v = Integer.parseInt(obj.readLine());
            graph = new int[v][v];

            int edge_number = Integer.parseInt(obj.readLine());

            for (int i = 0; i < edge_number; i++) {
                str = obj.readLine();
                StringTokenizer st = new StringTokenizer(str, " ");
                int token1 = Integer.parseInt(st.nextToken());
                int token2 = Integer.parseInt(st.nextToken());
                graph[token1][token2] = 1;
                graph[token2][token1] = 1;
            }

            end = Integer.parseInt(obj.readLine());
            StartNora = Integer.parseInt(obj.readLine());
            StartLara = Integer.parseInt(obj.readLine());

        } catch (IOException e) {
            System.out.println("Exception!!!");
        }

    }

    public int bfs(int start, int end) {
        //White=W;
        //Gray=G;
        //Black=B;
        String color[] = new String[v];
        int p[] = new int[v];
        int d[] = new int[v];
        Queue<Integer> q = new LinkedList<Integer>();
        
        for (int i = 0; i < v; i++) {
            color[i] = "W";
            d[i] = Integer.MAX_VALUE;//infinity
            p[i] = Integer.MIN_VALUE;//null
        }
        
        color[start] = "G";
        d[start] = 0;
        p[start] = Integer.MIN_VALUE;
        q.add(start);//works as enqueue

        while (!q.isEmpty()) {
            int x = q.poll();//works as dequeue
            for (int i = 0; i < v; i++) {
                if ((color[i].equals("W")) && (graph[x][i] == 1)) {
                    color[i] = "G";
                    d[i] = d[x] + 1;
                    p[i] = x;
                    q.add(i);
                }
            }
            color[x] = "B";
        }

        return d[end];
    }


}