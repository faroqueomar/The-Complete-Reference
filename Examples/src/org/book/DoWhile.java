package org.book;
/***
 * page 86
 * @author Admin
 *
 */
public class DoWhile {

	public static void main(String[] args) {
		int n = 10;
		do {
			System.out.println("tick " + n);
			n--;
		} while(n > 0);
		
	// Both do loop are same.
		
		do {
			System.out.println("tick " + n);
		} while(--n > 0);
	}
}
