public class Problem_1 {

    public static void main(String[] args) {

        String given = "CDEFGABC";
        String played = "CEFDABGAC";

        char a[] = given.toCharArray();
        char b[] = played.toCharArray();

        int m = a.length;
        int n = b.length;

        int[][] ab = new int[a.length + 1][b.length + 1];

        for (int i = 0; i < a.length + 1; i++) {
            for (int j = 0; j < b.length + 1; j++) {
                if (i == 0 || j == 0) {
                    ab[i][j] = 0;
                } else if (a[i - 1] == b[j - 1]) {
                    ab[i][j] = ab[i - 1][j - 1] + 1;
                } else {
                    if (ab[i - 1][j] > ab[i][j - 1]) {
                        ab[i][j] = ab[i - 1][j];
                    } else {
                        ab[i][j] = ab[i][j - 1];
                    }
                }
            }
        }

        commonNotes(a, b, ab, m, n);
        accuracy(ab, a, b);

    }

    public static void commonNotes(char[] a, char[] b, int[][] ab, int m, int n) {

        if (m == 1) {
            System.out.print(a[m - 1]);
            return;
        } else {

            if (ab[m][n] == ab[m][n - 1]) {
                commonNotes(a, b, ab, m, n - 1);
            } else if (ab[m][n] == ab[m - 1][n]) {
                commonNotes(a, b, ab, m - 1, n);
            } else {
                commonNotes(a, b, ab, m - 1, n - 1);
                System.out.print(a[m - 1]);

            }
        }
    }

    public static void accuracy(int[][] ab, char[] a, char[] b) {
        System.out.println("");
        float value = ab[a.length][b.length];
        float accuracy = (value / a.length) * 100;
        System.out.print(accuracy + "%  ");

        if (accuracy >= 50) {
            System.out.println("Passed");
        } else {
            System.out.println("Fail");
        }

    }

}
