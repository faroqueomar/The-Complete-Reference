package org.book;
/***
 * page 35
 * @author Admin
 *
 */

public class Light {

	public static void main(String[] args) {
		int lightspeed;
		long days;
		long seconds;
		long distance;
		
		lightspeed =  186000;
		
		days = 1000;
		
		seconds = days * 24 * 60 * 60;
		
		distance = lightspeed * seconds;
		
	/*	System.out.println("In " + days);
		System.out.println(" days light will travel about ");
		System.out.println(distance + " miles.");
	*/
		System.out.println("In " + days + " days light will travel about " + distance + " miles.");
	}
}
