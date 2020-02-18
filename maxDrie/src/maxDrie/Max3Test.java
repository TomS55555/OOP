package maxDrie;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Max3Test {
	/**
	 * 
	 */
	
	@Test
	void test() {
		assert Max3.max3(10, 20, 30) == 30;
		assert Max3.max3(30, 20 , 5) == 30;
		assert Max3.max3(24, 30, 5) == 30;
	}

}
