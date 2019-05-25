package exercises;

import junit.framework.TestCase;

public class StringReversal extends TestCase {
	/*
	 * Without using the reverse() method in StringBuffer or StringBuilder, write a
	 * string reverser that will make this unit test pass.
	 * 
	 * Then use it to decode this message: QcXgW9w4wQd=v?hctaw/moc.ebutuoy
	 */

	public void test() {
		assertEquals("cellardoor", reverseMe("roodrallec"));
	}

	private String reverseMe(String toReverse) {
		String reverse = "";

		for (int i = toReverse.length() - 1; i >= 0; i--) {
			reverse += toReverse.charAt(i);
		}
		return reverse;
		
	}
}
