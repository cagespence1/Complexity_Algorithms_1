import java.util.Scanner;

public class Permutation_1 {

    public static void main(String[] args) {

        Permutation_1 perm = new Permutation_1();

        long total = 0;

        Scanner inputScanner = new Scanner(System.in);
        System.out.print("input number of permutations: ");
        int n = inputScanner.nextInt();
        System.out.println("__________");

        for (int i = 0; i < 10; i++) {
            total += perm.run(n);
        }

        System.out.println("\naverage\n"+total/10);
    }

    public long run(int n) {

        long counter = 0;
        int j = n-1;

        // 1
        int[] permutations = new int[n];
        for(int i=0; i<permutations.length; i++){
            permutations[i] = -1;
        }

        // 2
        boolean unique = false;

        // 3
        for (int i = 0; i < n; i++) {

            // 4
            while (!unique) {

                // 5
                int x = randInt(j);

                // 6
                for (int k = 0; k < n; k++) {
                     counter ++;

                    if (x == permutations[k]){
                        break;
                    }

                    if (k == n-1){
                        unique = false;
                        permutations[i] = x;
                    }
                }
            }
        }

        System.out.print("*");
        return counter;

    }

    public int randInt(int j){
        return (int)(Math.random() * (j + 1));
    }
}
