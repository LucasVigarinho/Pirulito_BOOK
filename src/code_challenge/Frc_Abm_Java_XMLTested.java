package code_challenge;
//import org.junit.jupiter.api.Test;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

class Frc_Abm_Java_XMLTested {

	Frc_Abm_Java_XML test;
	String text, textIfNull, textNoLOC;
	Frc_Abm_Java_XML testOneABM, testTwoABM, testThreeABM;

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




	@Before
	public void init() {
		text = "UNA:+.? '\n" +
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
				"DTM+182:20090527:102'\n";

		textIfNull = null;

		textNoLOC = "UNA:+.? '\n" +
				"UNB+UNOC:3+2021000969+4441963198+180525:1225+3VAL2MJV6EH9IX+KMSV7HMD+CUSDECU-IE++1++1'\n" +
				"UNH+EDIFACT+CUSDEC:D:96B:UN:145050'\n" +
				"BGM+ZEM:::EX+09SEE7JPUV5HC06IC6+Z'\n" +
				"DTM+9:20090527:102'\n" +
				"DTM+268:20090626:102'\n" +
				"DTM+182:20090527:102'\n";

		testOneABM = new Frc_Abm_Java_XML(text);
		testTwoABM = new Frc_Abm_Java_XML (textIfNull);
		testThreeABM = new Frc_Abm_Java_XML(textNoLOC);
	}

	@Test
	public void checkIfArrayHas10Items() {
		String[] arrayStringResponseHandled = testOneABM.locEdiFact();
		Assert.assertNotNull(arrayStringResponseHandled);
		Assert.assertEquals(10, arrayStringResponseHandled.length);
	}

	@Test
	public void checkIfArrayHasStringSOLInThirdArraySlot() {
		String[] arrayStringResponseHandled = testOneABM.locEdiFact();
		Assert.assertEquals("check If Array Has String SOL In Third Array Slot", "SOL", arrayStringResponseHandled[3]);
	}

	@Test(expected = IllegalArgumentException.class)
	public void checkIfArgumentParameterIsNull() {
		testTwoABM.locEdiFact();
	}

	@Test(expected = IllegalArgumentException.class)
	public void checkIfHasNotLOCSegment(){

		testThreeABM.locEdiFact();

	}
}
