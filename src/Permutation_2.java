import java.util.Scanner;

public class Permutation_2 {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("input number of permutations: ");

        int n = inputScanner.nextInt();
        System.out.println("__________");
        long total = 0;

        Permutation_2 perm = new Permutation_2();
        for (int i = 0; i < 10; i++) {
            total += perm.run(n);
        }

        System.out.println("\naverage\n"+total/10);
    }

    private long run(int n) {

        long counter = 0;
        int j = n - 1;

        // 1
        int[] permutations = new int[n];

        // 2
        boolean[] used = new boolean[n];

        // 3
        for (int i = 0; i < n; i++) {

            int x = randInt(j);

            while (used[x]) {
                counter++;
                x = randInt(j);
            }

            used[x] = true;
            permutations[i] = x;
        }

        System.out.print("*");

        return counter;

    }

    public int randInt(int j) {
        return (int) (Math.random() * (j + 1));
    }
}
