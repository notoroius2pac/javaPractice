package tasks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exercise1Test {

	@Test
	void testGetSecondSmallest() {
		int[] arr = new int[] {2,6,24,25,7,46,5,41,6,8,79};
		Exercise1 ex = new Exercise1();
		assertEquals(5, ex.getSecondSmallest(arr));
	}

}
