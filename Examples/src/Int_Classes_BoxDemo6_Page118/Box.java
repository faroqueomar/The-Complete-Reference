package Int_Classes_BoxDemo6_Page118;
/***
 * page 118
 * @author Admin
 *
 */
public class Box {
	double width;
	double height;
	double depth;
	
	// This is the constructor for Box.
	
	Box() {
		System.out.println("Constructing Box");
		width = 10;
		height = 10;
		depth = 10;
	}
	
	// compute and return volume
	
	double volume() {
		return width * height * depth;
	}
}
