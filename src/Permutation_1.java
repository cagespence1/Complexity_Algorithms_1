import java.util.Scanner;

public class Permutation_1 {

    public static void main(String[] args) {

        new Permutation_1().run();

    }

    public void run() {

        System.out.print("input number of permutations: ");

        //initialize the scanner
        Scanner inputScanner = new Scanner(System.in);

        //get scanner input
        int n = inputScanner.nextInt();

        //set upper bound of random number generation
        int j = n-1;

        //create the arary with length n
        int[] permutations = new int[n];

        boolean same = true;

        //main for-loop
        for (int i = 0; i < n; i++) {
            while (same) {

                int x = randInt(j);

                for (int k = 0; k < n; k++) {

                    if (x == permutations[k]){
                        k = n+1;
                    }

                    if (k == n){
                        same = false;
                        permutations[i] = x;
                    }
                }
            }
        }

        System.out.println(permutations);
        
    }

    public int randInt(int j){
        return (int)(Math.random() * (j + 1));
    }
}
