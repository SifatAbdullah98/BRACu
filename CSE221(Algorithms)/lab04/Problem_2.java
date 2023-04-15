public class Problem_2 {

    public static void main(String[] args) {

        String given = "MWCADBOE";
        String played = "DMWCAROP";

        String[] words = {"monkeys", "wearing", "coats", "are", "doctors", "because", "of", "evolution", "results", "eruption"};
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

        System.out.println(ab[a.length][b.length]);
        commonNotes(a, b, ab, words, m, n);

    } 

    public static void commonNotes(char[] a, char[] b, int[][] ab, String[] words, int m, int n) {

        if (m == 1) {
            System.out.print(words[m - 1] + " ");
            return;
        } else {

            if (ab[m][n] == ab[m][n - 1]) {
                commonNotes(a, b, ab, words, m, n - 1);
            } else if (ab[m][n] == ab[m - 1][n]) {
                commonNotes(a, b, ab, words, m - 1, n);
            } else {
                commonNotes(a, b, ab, words, m - 1, n - 1);
                System.out.print(words[m - 1] + " ");

            }
        }
    }

}
