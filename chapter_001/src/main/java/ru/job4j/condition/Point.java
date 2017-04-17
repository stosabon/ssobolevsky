package ru.job4j.condition;
/**
* Class Point to describe point location.
* @author ssobolevsky
* @since 17.04.2017
* @version 1
*/
public class Point {
	/**
	* Coordinates of points.
	*/
	private int x, y;
	/**
	* Constructor of point.
	* @param x - X coordinate
	* @param y - Y coordinate
	*/
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/**
	* Method to return X coordinate.
	* @return X coordinate
	*/
	public int getX() {
		return this.x;
	}
	/**
	* Method to return Y coordinate.
	* @return Y coordinate
	*/
	public int getY() {
		return this.y;
	}
	/**
	* Method to determine whether a point is on a function.
	* @param a - first coefficient
	* @param b - second coefficient
	* @return true or false
	*/
	public boolean is(int a, int b) {
		return y == a * x + b;
	}

}