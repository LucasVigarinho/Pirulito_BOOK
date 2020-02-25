package code_challenge;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

class MyDomParserTested {

	MyDomParser test;
	String text, textIfNull;
	MyDomParser testOneXML, testTwoXML, testThreeXML;

	@Test public void setUp() throws Exception {
		test = new MyDomParser("documentTest.xml");
	}




	@Before
	public void init() {
		text = "documentTest.xml";

		textIfNull = null;

		
		testOneXML = new MyDomParser(text);
		testTwoXML = new MyDomParser (textIfNull);
//		testThreeXML = new MyDomParser(textNoLOC);
	}

//	@Test
//	public void checkIfPrintsThreeResults() {
//		String[] arrayStringResponseHandled = testOneXML.solution();
//		Assert.assertNotNull(arrayStringResponseHandled);
//		Assert.assertEquals(10, arrayStringResponseHandled.length);
//	}
//
//	@Test
//	public void checkIfArrayHasStringSOLInThirdArraySlot() {
//		String[] arrayStringResponseHandled = testOneABM.locEdiFact();
//		Assert.assertEquals("check If Array Has String SOL In Third Array Slot", "SOL", arrayStringResponseHandled[3]);
//	}

	@Test(expected = IllegalArgumentException.class)
	public void checkIfArgumentParameterIsNull() {
		testTwoXML.solution();
	}

	@Test(expected = IllegalArgumentException.class)
	public void checkIfHasNotLOCSegment(){

		testThreeXML.solution();

	}


}
