package Int_Classes_BoxDemo7_Page119_120;
/***
 * page119
 * @author Admin
 *
 */
public class Box {
	double width;
	double height;
	double depth;
	
	// This is the constructor for Box.
	
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
	
	// compute and return volume
	
	double volume() {
		return width * height * depth;
	}
}
