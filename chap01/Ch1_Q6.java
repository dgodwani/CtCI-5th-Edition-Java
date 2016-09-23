package Strings;

public class Ch1_Q6 {

	public static int[][] rotate(int[][] matrix, int size) {

		for (int i = 0; i < size / 2; i++) {

			int first = i;
			int last = size - 1 - i;

			for (int j = first; j < last; j++) {
				int temp = matrix[first][j];
				matrix[first][j] = matrix[last - j + i][first];
				matrix[last - j + i][first] = matrix[last][last - j + i];
				matrix[last][last - j + i] = matrix[j][last];
				matrix[j][last] = temp;
			}
		}
		return matrix;

	}

	public static void main(String[] args) {
		int[][] inputMatrix = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 }, };
		for (int i = 0; i < inputMatrix.length; i++) {
			for (int j = 0; j < inputMatrix.length; j++) {
				System.out.print(inputMatrix[i][j] + " ");
			}
			System.out.println();
		}

		int[][] Resultmatrix = rotate(inputMatrix, 5);
		for (int i = 0; i < Resultmatrix.length; i++) {
			for (int j = 0; j < Resultmatrix.length; j++) {
				System.out.print(Resultmatrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
