package arrayEx;

public class ArrayOperator {
    public static int sum(int[] array){
        int total = 0;
        for (int i : array) {
            total += i;
        }
        return total;
    }

    public static int mult(int[] array){
        int total = 1;
        for (int i : array) {
            total *= i;
        }
        return total;
    }

    public static double average(int[] array){
        return (double) sum(array) / (double) array.length;
    }

    public static int[][] matMult(int[][] matrix1, int[][] matrix2) {
        assert matrix1.length == matrix2.length;
        assert matrix1[0].length == matrix2[0].length;
        int[][] mulMat = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < mulMat.length; i++) {
            for (int j = 0; j < mulMat[i].length; j++) {
                mulMat[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        return mulMat;
    }
}
