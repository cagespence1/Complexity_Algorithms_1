import java.util.Scanner;

public class Permutation_2 {

    public static void main(String[] args) {
        while (true)
        new Permutation_2().run();
    }

    private void run() {

        //initialize the scanner
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("input number of permutations: ");

        //get scanner input
        int n = inputScanner.nextInt();

        //set upper bound of random number generation
        int j = n-1;

        //create the arrays with length n
        int[] permutations = new int[n];
        boolean[] used = new boolean[n];

        long startTime = System.currentTimeMillis();

        //main for-loop
        for (int i = 0; i < n; i++) {

                int x = randInt(j);

                if (!used[x]){
                    permutations[i] = x;
                } else {
                    i--;
                }
            }

        System.out.println("time: " + (System.currentTimeMillis() - startTime));

        for (int i = 0; i < permutations.length; i++) {
            System.out.print(permutations[i] + ", ");
        }
        System.out.println();

    }

    public int randInt(int j){
        return (int)(Math.random() * (j + 1));
    }
}
