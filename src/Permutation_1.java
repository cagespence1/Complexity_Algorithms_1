import java.util.Scanner;

public class Permutation_1 {

    public static void main(String[] args) {

        new Permutation_1().run();

    }

    public void run() {

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

        boolean same = true;

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

            if (i == n-1){

            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(permutations[i]);
        }

    }

    public int randInt(int j){
        return (int)(Math.random() * (j + 1));
    }
}
