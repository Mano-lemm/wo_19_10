package arrayEx;
import java.util.Random;

public class ArrayGenerator {
    public static Random rand = new Random(0L);

    public static int[][] generateRandomMatrix(int lowerBound, int upperBound, int columnLength, int rowLength){
        int[][] matrix = new int[rowLength][];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = generateRandom(lowerBound, upperBound, columnLength);
        }
        return matrix;
    }

    public static int[] generateRandom(int lowerBound, int upperBound, int length){
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(lowerBound, upperBound);
        }
        return array;
    }

    public static int[] generateRandom(int upperBound, int length){
        return generateRandom(0, upperBound, length);
    }

    public static int[] generateRandom(int length){
        return generateRandom(Integer.MIN_VALUE, Integer.MAX_VALUE, length);
    }
}
