package testsoftware.test;

// import static org.junit.jupiter.api.Assertions.*;

// import org.junit.Before;
// import org.junit.jupiter.api.AfterEach;
// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;

// class AssertTest {

// 	@Before
// 	public static boolean isEmpty (final CharSequence cs) {
// 		return cs == null || cs.length() == 0;
// 	}

// 	@Before 
// 	public static boolean isBlank(final CharSequence cs) {
// 		int strLen;
// 		if (cs == null || (strLen = cs.length()) == 0)
// 		{
// 			return true;
// 		}
// 		for (int i = 0; i < strLen; i++) {
// 			if(!Character.isWhitespace(cs.charAt(i))) {
// 				return false;
// 			}
// 		}
// 		return true;
// 	}

// 	@Test
// 	public void test() {
// 		String obj1 = "junit";
// 		String obj2 = "junit";
// 		String obj3 = "test";
// 		String obj4 = "test";
// 		String obj5 = null;
// 		int var1 = 1;
// 		int var2 = 2;
// 		double result = var1+var2;
// 		int[]arithmetic1 = {1,2,3};
// 		int[]arithmetic2 = {1,2,3};
		
// 		assertEquals(obj1, obj2);
// 		assertEquals(3.0, result,0);
// 		assertSame(obj3, obj4);
// 		assertNotSame(obj2, obj4);
// 		assertNotNull(obj1);
// 		assertNull(obj5);
// 		assertNotSame(var1, var2);
// 		assertArrayEquals(arithmetic1, arithmetic2);
// 	}

// }
