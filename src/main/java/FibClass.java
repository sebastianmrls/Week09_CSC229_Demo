public class FibClass {

    public static int fibRec(int n) {
        if (n <= 1) {
            return n;
        }
        return fibRec(n - 1) + fibRec(n - 2);
    }

    static int fibIter(int n) {

        int i, f[] = new int[n + 2];
        f[0] = 0;
        f[1] = 1;

        for (i = 2; i <= n; i++)
            f[i] = f[i - 1] + f[i - 2];

        return f[n];
    }

}
