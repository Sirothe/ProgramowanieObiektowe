import java.util.BitSet;

public class Erastotenes {
    public static void erastotenes(int n) {
        BitSet b = new BitSet(n + 1);
        for (int j = 2; j <= n; ++j) {
            b.set(j);
        }
        int j = 2;
        while (j * j <= n) {
            if (b.get(j)) {
                int k = 2 * j;
                while (k <= n) {
                    b.clear(k);
                    k += j;
                }
            }
            ++j;
        }
        int[] primes = b.stream().toArray();
        for (int x : primes) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
