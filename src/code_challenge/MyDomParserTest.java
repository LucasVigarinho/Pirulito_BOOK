package code_challenge;

import org.junit.Before;
import org.junit.Test;

public class MyDomParserTest {

	MyDomParser test;
	String text, textIfNull;
	MyDomParser testOneXML, testTwoXML, testThreeXML;



	@Before
	public void init() {
		text = "documentTest.xml";

		textIfNull = null;

		
		testOneXML = new MyDomParser(text);
		testTwoXML = new MyDomParser (textIfNull);

	}


	@Test public void setUp() throws Exception {
		test = new MyDomParser("documentTest.xml");
	}


	@Test(expected = IllegalArgumentException.class)
	public void checkIfArgumentParameterIsNull() {
		testTwoXML.solution();
	}



}
