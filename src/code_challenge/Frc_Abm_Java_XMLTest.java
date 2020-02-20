package code_challenge;
import org.junit.jupiter.api.Test;


class Frc_Abm_Java_XMLTest {
	
	Frc_Abm_Java_XML test;
	
	@Test void setUp() throws Exception {
        test = new Frc_Abm_Java_XML("UNA:+.? '\n" + 
				"UNB+UNOC:3+2021000969+4441963198+180525:1225+3VAL2MJV6EH9IX+KMSV7HMD+CUSDECU-IE++1++1'\n" + 
				"UNH+EDIFACT+CUSDEC:D:96B:UN:145050'\n" + 
				"BGM+ZEM:::EX+09SEE7JPUV5HC06IC6+Z'\n" + 
				"LOC+17+IT044100'\n" + 
				"LOC+18+SOL'\n" + 
				"LOC+35+SE'\n" + 
				"LOC+36+TZ'\n" + 
				"LOC+116+SE003033'\n" + 
				"DTM+9:20090527:102'\n" + 
				"DTM+268:20090626:102'\n" + 
				"DTM+182:20090527:102'\n" + 
				""		);
    }


//	@Test
//	void testEquals() {
//		String [] myArray = {"17", "IT044100", "18", "SOL", "35", "SE", "36", "TZ", "116", "SE003033"};
//		String [] answer = test.locEdiFact();
//		myArray.equals(answer);
//	}
//
//	@Test
//	void testClone() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testToString() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testNotify() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testNotifyAll() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testWait() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testWaitLong() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testWaitLongInt() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testFinalize() {
//		fail("Not yet implemented");
//	}
//
}
