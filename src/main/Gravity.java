/*
 * @author Janvi Pangoriya
 * @version 1.0
 * */
package main;
import java.util.Scanner;


public class Gravity {
	public static void main(String[] args) {
		double time=0.0;
		double speed=0.0;
		double distance=0.0;
		double gravity=9.8;
		Scanner obj =new Scanner(System.in);
		time = obj.nextDouble();
		speed=gravity*time;
		distance=0.5*gravity*time*time;
		System.out.println("The speed of the object at "+time+" seconds after its release is "+speed+" and the distance the object has travelled in the "+time+" seconds after the realese is "+distance);


		 *   a. Declare all your necessary variables inside main method.
		 *   b. Declare a constant for 'gravity', assume the value to be 9.8
		 *   c. Calculate the result and print it to the screen.
		 * */
	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
}
