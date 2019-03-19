package com.codewars.max.codewars.matrixaddition;

public class MatrixAddition {
	public static int[][] matrixAddition(int[][] matrixA, int[][] matrixB) {

		for(int n = 0; n < matrixA.length; n++ ) {
			for(int m = 0; m < matrixA.length; m++ ) {
				matrixA[n][m] += matrixB[n][m];
			}
		}
		
		return matrixA;
		
	}
}