
import static org.junit.Assert.*;

import org.junit.Test;


public class ClassB_test {

	@Test
	public void test() {
		ClassB testB = new ClassB();
		assertEquals("Does this return 100?",100,testB.add_number_to_hundred());
		assertTrue("This should return true",testB.calculate_true_or_false("orange"));
		assertFalse("This should return false",testB.calculate_true_or_false("papaya"));
	}

}
