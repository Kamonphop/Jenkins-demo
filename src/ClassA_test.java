
import static org.junit.Assert.*;

import org.junit.Test;

public class ClassA_test {

	@Test
	public void test() {
		ClassA A = new ClassA();
		assertEquals("Does this return?",1,A.secret_number());
	}
	
}
