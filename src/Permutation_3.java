import java.util.Scanner;

public class Permutation_3 {
    public static void main(String[] args) {
        while (true)
        new Permutation_3().run();
    }

    private void run() {

        //initialize the scanner
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("input number of permutations: ");

        //get scanner input
        int n = inputScanner.nextInt();

        //set upper bound of random number generation
        int j = n-1;
        int swapPosition = 0;

        //create the arrays with length n
        int[] permutations = new int[n];

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {

            swapPosition = randInt(i); //0-i

            permutations[i] = permutations[swapPosition]; //replace [i] with the temp value

            permutations[swapPosition] = i; //replace the [swapPosition] with i
        }

        System.out.println("time: " + (System.currentTimeMillis() - startTime));

    }

    public int randInt(int j){
        return (int)(Math.random() * (j + 1));
    }
}
