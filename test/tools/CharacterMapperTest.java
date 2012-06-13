/**
 * 
 */
package tools;

import static org.junit.Assert.*;

import java.util.HashMap;

import krypto.tools.CharacterMapper;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A JUnit 4 test for the CharacterMapper class functionality
 * @author Miro Ljubicic
 *
 */
public class CharacterMapperTest {

	CharacterMapper testmapper;
	HashMap<Character, Double> originalMap;
	HashMap<Character, Double> resultFrequencyAnalysis;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		testmapper = new CharacterMapper();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertNotNull(testmapper);
		testmapper.getCharacterMapping(originalMap, resultFrequencyAnalysis);
		
	}
		

}
