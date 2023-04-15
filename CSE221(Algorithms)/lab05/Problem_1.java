import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
public class Problem_1 {
    String player[];
    int price[];
    int form[];
    String[] position;
    int m[][];
    int mp;
    int il;
    public static void main(String[] args) {
        Problem_1 in = new Problem_1();
        in.input();
        in.knapsack();
        System.out.println("Bought Players : ");
        in.knapsackPrint(in.il, in.mp, in.m[in.il][in.mp]);
        System.out.println("");
        System.out.println("Maximum summation of form : " + in.m[in.il][in.mp]);        
             for (int i = 0; i < in.player.length + 1; i++) {
                for (int j = 0; j < in.mp + 1; j++) {
                    //System.out.print(in.m[i][j] + " ,  ");
                }
                System.out.println("");
            }
    }//---------------------------end main method
    public void input() {
        try {
            FileReader file = new FileReader("G:\\Fall20\\CSE221(Algorithms)\\lab05\\input_1.txt");
            BufferedReader obj = new BufferedReader(file);
            mp = Integer.parseInt(obj.readLine());
            il = Integer.parseInt(obj.readLine());
            player = new String[il];
            price = new int[il];
            form = new int[il];
            position = new String[il];
            m = new int[il + 1][mp + 1];
            for (int i = 0; i < il; i++) {
                StringTokenizer st = new StringTokenizer(obj.readLine(), " ");
                player[i] = st.nextToken();
                price[i] = Integer.parseInt(st.nextToken());
                form[i] = Integer.parseInt(st.nextToken());
                position[i] = st.nextToken();
            }    
        } catch (IOException e) {
        }
    }//-----------------------------end input

    public void knapsack() {
        for (int i = 0; i < il + 1; i++) {
            for (int j = 0; j < mp + 1; j++) {

                if (i == 0 || j == 0) {
                    m[i][j] = 0;
                } else if (price[i - 1] > j) {
                    m[i][j] = m[i - 1][j];
                } else {
                    if (m[i - 1][j] > form[i - 1] + m[i - 1][j - price[i - 1]]) {
                        m[i][j] = m[i - 1][j];
                    } else {
                        m[i][j] = form[i - 1] + m[i - 1][j - price[i - 1]];
                    }
                }
            }//---------end j
        }//-----------end i
    }

    public void knapsackPrint(int il, int mp, double r) {
        if (r == 0) {
            return;
        } else {
            if (m[il][mp] == m[il - 1][mp]) {
                knapsackPrint(il - 1, mp, r);
            } else if (m[il][mp] == m[il][mp - 1]) {
                knapsackPrint(il, mp - 1, r);
            } else {
                int a = il - 1, b = mp - price[il - 1];
                r = Double.parseDouble(new DecimalFormat("0.00").format(m[il][mp] - form[il - 1]));
                knapsackPrint(a, b, r);
                System.out.print("---->" + player[il - 1]);
            }
        }

    }//---------------end knapsack

}//---------------------end class

