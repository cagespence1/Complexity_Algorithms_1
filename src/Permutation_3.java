import java.util.Arrays;
import java.util.Scanner;

public class Permutation_3 {
    public static void main(String[] args) {

        Permutation_3 perm = new Permutation_3();
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("input number of permutations: ");
        int n = inputScanner.nextInt();
        System.out.println("__________");

        for (int i = 0; i < 10; i++) {
            perm.run(n);
        }
    }

    private void run(int n) {

        // 1
        int[] permutations = new int[n];

        // 2
        int swapPosition;

        long counter = 0;

        for (int i = 0; i < n; i++) {                                                           // n^2
            counter++;
            swapPosition = randInt(i); //0-i                                                    // +1
            permutations[i] = permutations[swapPosition]; //replace [i] with the temp value     // +1
            permutations[swapPosition] = i; //replace the [swapPosition] with i                 // +1
        }

        System.out.println(counter);

    }

    public int randInt(int j){
        return (int)(Math.random() * (j + 1));
    }
}