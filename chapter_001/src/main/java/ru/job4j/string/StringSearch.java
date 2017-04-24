package ru.job4j.string;
/**
* Class to search substring in string.
* @author ssobolevsky
* @since 23.04.2017
* @version 1
*/
public class StringSearch {
	/**
	* Method to search substring in string.
	* @param origin - string whichis searched substring
	* @param sub - substring
	* @return the presence of a substring in a string
	*/
	boolean contains(String origin, String sub) {
		boolean isContained = false;
		char[] originString = origin.toCharArray();
		char[] substring = sub.toCharArray();
		if (originString.length >= substring.length) {
			for (int i = 0; i <= originString.length - substring.length; i++) {
				if (originString[i] == substring[0]) {
					int count = 0;
					for (int j = 0; j <substring.length; j++) {
						if (origingStrim[i + j] == subString[k]){
    						count++;
						} else {
   							break;
						}
					}
					if (count == substring.length) {
						isContained = true;
					}
				}
			}
		}
		return isContained;
	}
}