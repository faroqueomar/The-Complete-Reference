package Overloading_Methods_Page126_127;
/***
 * page 127
 * @author Admin
 *
 */
public class Overload {

	public static void main(String[] args) {
		OverloadDemo ob = new OverloadDemo();
		int i = 88;
		ob.test();
		ob.test(10, 20);
		ob.test(i); // this will invoke test(double)
		ob.test(123.2); // this will invoke test(double)
	}
}
