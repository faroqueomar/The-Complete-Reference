package org.book;
/***
 * page 106
 * @author Admin
 *
 */
public class Box {
	double width;
	double height;
	double depth;
	
	// display volume of a box
	void volume() {
		System.out.print("Volume is ");
		System.out.println(width * height * depth);
	}
}
