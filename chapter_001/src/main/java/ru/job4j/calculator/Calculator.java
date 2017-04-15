package ru.job4j.calculator;
/**
* Class Calculator for arithmetic operations.
* @author ssobolevsky
* @since 15.04.2017
* @version 1
*/
public class Calculator {
	/**
	*Variable to save result.
	*/
	private double result = 0;
	/**
	* Method to add two nubmers.
	* @param first - first argument
	* @param second - second argument
	*/
	public void add(double first, double second) {
		this.result = first + second;
	}
	/**
	* Method to substruct two nubmers.
	* @param first - first argument
	* @param second - second argument
	*/
	public void substruct(double first, double second) {
		this.result = first - second;
	}
	/**
	* Method to div two nubmers.
	* @param first - first argument
	* @param second - second argument
	*/
	public void div(double first, double second) {
		this.result = first / second;
	}
	/**
	* Method to multiple two nubmers.
	* @param first - first argument
	* @param second - second argument
	*/
	public void multiple(double first, double second) {
		this.result = first * second;
	}
		/**
	* Method to return result.
	* @return result - final result
	*/
	public double getResult() {
		return this.result;
	}
}