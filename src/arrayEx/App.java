package arrayEx;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /* 
        //oef 1
        int[] ints = ArrayGenerator.generateRandom(100, 10);
        System.out.println("De array is: ");
        System.out.println(Arrays.toString(ints));
        System.out.println("De even getallen zijn:");
        for (int i : ints) {
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //oef 2
        System.out.println("De array is: ");
        System.out.println(Arrays.toString(ints));
        Arrays.sort(ints);
        System.out.println("Het grootste getal is: " + ints[ints.length - 1]);

        //oef 3
        int[] randInts = ArrayGenerator.generateRandom(1, 23, 6);
        System.out.println("De array is:");
        System.out.println(Arrays.toString(randInts));
        System.out.printf("De som is %d, het gemiddelde % .2f en de vermenigvuldiging %d.\n",
                          ArrayOperator.sum(randInts),
                          ArrayOperator.average(randInts),
                          ArrayOperator.mult(randInts));

        //oef 4
        int index = 0;
        int[] guesses = new int[2];
        int toGuess = (int) (Math.random() * 20);
        int guessed;
        */
        Scanner s = new Scanner(System.in);
        /*
        do {
            System.out.println("Guess a number between 0 and 20");
            guessed = s.nextInt();
            if(guessed > toGuess){
                System.out.println("The number is smaller than " + guessed + ".");
            } else if(guessed < toGuess){
                System.out.println("The number is bigger than " + guessed + ".");
            }
            guesses = Arrays.copyOf(guesses, guesses.length + 1);
            guesses[index] = guessed;
            index++;
        } while (guessed != toGuess);
        System.out.println(guessed + " was the number!");
        System.out.println("your guesses were:");
        System.out.println(Arrays.toString(guesses));
        */

        //oef 5
        System.out.println("Kies de lengte van de kollomen en rijen van de matrix");
        int rowLength = s.nextInt();
        int columnLength = s.nextInt();
        int[][] matrix1 = ArrayGenerator.generateRandomMatrix(1, 10, columnLength, rowLength);
        int[][] matrix2 = ArrayGenerator.generateRandomMatrix(1, 10, columnLength, rowLength);
        System.out.println("Matrix 1:");
        System.out.println(Arrays.deepToString(matrix1).replaceAll("\\],", "],\n"));
        System.out.println("Matrix 2:");
        System.out.println(Arrays.deepToString(matrix2).replaceAll("\\],", "],\n"));
        System.out.println("De vermenigvuldiging: ");
        System.out.println( Arrays.deepToString(ArrayOperator.matMult(matrix1, matrix2))
                            .replaceAll("\\],","],\n"));

        // oef 6

        int[][] spelers = ArrayGenerator.generateRandomMatrix(1, 13, 2, 4);
        int winningNum = -1;
        for (int[] is : spelers) {
            int sum = ArrayOperator.sum(is);
            if(sum > winningNum && sum < 23){
                winningNum = sum;
            }
        }

        for (int i = 0; i < spelers.length; i++) {
            if(winningNum == ArrayOperator.sum(spelers[i])){
                System.out.printf("Speler %d wint met %s kaarten en %d in totaal.", i, Arrays.toString(spelers[i]), ArrayOperator.sum(spelers[i]));
            }
        }
        System.out.println();
        s.close();
    }
}
