package optional;

import java.util.ArrayList;

/* Burst an ArrayList by putting so many things into it that you cause an OutOfMemory error. */

public class ArrayOverload {

	public static void main(String[] args) {
		ArrayList<Double> overload = new ArrayList<Double>();
		while(true) {
			overload.add(200.0);
		}
	}
}
