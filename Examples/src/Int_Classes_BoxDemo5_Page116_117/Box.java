package Int_Classes_BoxDemo5_Page116_117;
/***
 * page 116-117
 * @author Admin
 *
 */
public class Box {
	double width;
	double height;
	double depth;
	
	// compute and return volume
	
	double volume() {
		return width * height * depth;
	}
	
	// sets dimensions of box
	
	void setDim(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
}
