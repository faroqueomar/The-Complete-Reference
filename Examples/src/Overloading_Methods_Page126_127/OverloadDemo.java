package Overloading_Methods_Page126_127;
/***
 * page 126
 * @author Admin
 *
 */
public class OverloadDemo {
	void test() {
		System.out.println("No parameters");
	}
	
	// Overload test for two integer parameters.
	
	void test(int a, int b) {
		System.out.println("a and b: " + a + " " + b);
	}
	// overload test for a double parameter
	
	void test(double a) {
		System.out.println("Inside test(double) a: " + a);
	}
}
