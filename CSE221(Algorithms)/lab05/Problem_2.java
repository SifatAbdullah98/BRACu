import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
public class Problem_2 {
    String club[];
    int weight[];
    double value[];
    String[] trophy;
    double m[][];
    int mw;
    int il;
    public static void main(String[] args) {      
        Problem_2 in = new Problem_2();
        in.input();
        in.knapsack();
        System.out.println("Name of clubs whose trophies were sold:");
        in.knapsackPrint(in.il, in.mw, in.m[in.il][in.mw]);
        System.out.println("");
        System.out.println("Maximum money he earned: " + in.m[in.il][in.mw]);
    }
    public void input() {
        try {
            FileReader file = new FileReader("G:\\Fall20\\CSE221(Algorithms)\\lab05\\input_2.txt");
            BufferedReader obj = new BufferedReader(file);
            mw = Integer.parseInt(obj.readLine());
            il = Integer.parseInt(obj.readLine());
            club = new String[il];
            weight = new int[il];
            value = new double[il];
            trophy = new String[il];
            m = new double[il + 1][mw + 1];
            for (int i = 0; i < il; i++) {

                StringTokenizer st = new StringTokenizer(obj.readLine(), " ");

                club[i] = st.nextToken();
                weight[i] = Integer.parseInt(st.nextToken());
                value[i] = Double.parseDouble(st.nextToken());
                trophy[i] = st.nextToken();

            }
        } catch (IOException e) {
        }
    }//-----------------------------end input

    public void knapsack() {

        for (int i = 0; i < il + 1; i++) {
            for (int j = 0; j < mw + 1; j++) {

                if (i == 0 || j == 0) {
                    m[i][j] = 0;
                } else if (weight[i - 1] > j) {
                    m[i][j] = m[i - 1][j];
                } else {

                    if (m[i - 1][j] > value[i - 1] + m[i - 1][j - weight[i - 1]]) {
                        m[i][j] = m[i - 1][j];
                    } else {
                        m[i][j] = Double.parseDouble(new DecimalFormat("0.00").format(value[i - 1] + m[i - 1][j - weight[i - 1]]));
                    }

                }

            }//---------end j
        }//-----------end i

    }//---------------end knapsack

    public void knapsackPrint(int il, int mw, double r) {

        if (r == 0) {
            return;
        } else {

            if (m[il][mw] == m[il - 1][mw]) {
                knapsackPrint(il - 1, mw, r);
            } else if (m[il][mw] == m[il][mw - 1]) {
                knapsackPrint(il, mw - 1, r);
            } else {

                int a = il - 1, b = mw - weight[il - 1];
                r = Double.parseDouble(new DecimalFormat("0.00").format(m[il][mw] - value[il - 1]));

                knapsackPrint(a, b, r);
                System.out.print("--->" + club[il - 1]);
            }
        }

    }//---------------end knapsack

}
