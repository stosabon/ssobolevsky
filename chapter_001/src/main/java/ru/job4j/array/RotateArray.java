package ru.job4j.array;
/**
* Class to rotate matrix.
* @author ssobolevsky
* @since 21.04.2017
* @version 1
*/
public class RotateArray {
	/**
	* Method to rotate.
	* @param array - input matrix
	* @return rotated martix
	*/
	public int[][] rotate(int[][] array) {
		int len = array[0].length;
		for (int i = 0; i < len / 2; i++) {
			for (int j = i; j < len - 1 - i; j++) {
				int temp = array[i][j];
				array[i][j] = array[len - 1 - j][i];
				array[len - 1 - j][i] = array[len - 1 - i][len - 1 - j];
				array[len - 1 - i][len - 1 - j] = array[j][len - 1 - i];
				array[j][len - 1 - i] = temp;
			}

		}
		return array;
	}
}