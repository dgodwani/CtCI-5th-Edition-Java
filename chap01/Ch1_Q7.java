package Strings;

public class Ch1_Q7 {

	public static int[][] setZeros(int[][] matrix) {
		
		boolean rows[] = new boolean[matrix.length];
		boolean cols[] = new boolean[matrix[0].length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					rows[i] = true;
					cols[j] = true;
				}
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (rows[i] || cols[j]) {
					matrix[i][j] = 0;
				}
			}
		}
		return matrix;
	}
	
	public static void main(String[] args) {
		int[][] inputMatrix = { { 1, 2, 3, 4, 5 }, { 6, 7, 0, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 }, };
		for (int i = 0; i < inputMatrix.length; i++) {
			for (int j = 0; j < inputMatrix.length; j++) {
				System.out.print(inputMatrix[i][j] + " ");
			}
			System.out.println();
		}

		int[][] Resultmatrix = setZeros(inputMatrix);
		for (int i = 0; i < Resultmatrix.length; i++) {
			for (int j = 0; j < Resultmatrix.length; j++) {
				System.out.print(Resultmatrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
