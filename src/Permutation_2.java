import java.util.Scanner;

public class Permutation_2 {

    public static void main(String[] args) {
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

        //create the arary with length n
        int[] permutations = new int[n];

        for(int i=0; i<permutations.length; i++){
            permutations[i] = -1;
        }

        //initialize the same boolean
        boolean same = true;

        long startTime = System.currentTimeMillis();

        //main for-loop
        for (int i = 0; i < n; i++) {

            same = true;
            while (same) {

                int x = randInt(j);

                for (int k = 0; k < n; k++) {

                    if (x == permutations[k]){
                        break;
                    }

                    if (k == n-1){
                        same = false;
                        permutations[i] = x;
                    }
                }
            }
        }

        System.out.println("time: " + (System.currentTimeMillis() - startTime));

    }

    public int randInt(int j){
        return (int)(Math.random() * (j + 1));
    }
}
