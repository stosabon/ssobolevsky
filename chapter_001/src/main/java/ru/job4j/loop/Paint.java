package ru.job4j.loop;
/**
* Class for paint pseudopyramide.
* @author ssobolevsky
* @since 19.04.2017
* @version 1
*/
public class Paint {
	/**
	* Method to paint pseudopyramide.
	* @param h - height of pyramide;
	* @return painting of pyramide
	*/
	public String piramid(int h) {
		String pyramide = "";
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < 2 * h - 1; j++) {
				if (j >= h - i - 1  && j <= h + i - 1) {
					pyramide = pyramide + "^";
				} else {
					pyramide = pyramide + " ";
				}
			}
			if (i < h - 1) {
				pyramide = pyramide + String.format("%s", System.getProperty("line.separator"));
			}
		}
		return pyramide;
	}
}