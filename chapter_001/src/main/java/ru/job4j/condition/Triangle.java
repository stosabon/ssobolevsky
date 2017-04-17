package ru.job4j.condition;

import static java.lang.Math.abs;
/**
* @author ssobolevsky
* @since 17.04.2017
* @version 1
*/
public class Triangle {
	/**
	* Coordinates of triangle.
	*/
	private Point a, b, c;
	/**
	* Constructor of triangle.
	* @param a - first point
	* @param b - second point
	* @param c - third point
	*/
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	/**
	* Method for calculating the area of a triangle.
	* @return area of a triangle
	*/
	public double area() {
		double area = abs(((a.getX() - c.getX()) * (b.getY() - c.getY()) - (b.getX() - c.getX()) * (a.getY() - c.getY())) / 2);
		return area;
	}
}