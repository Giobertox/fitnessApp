/**
 * 
 */
package com.giobertox.pattern.creational;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author giovanni
 *
 */
public class TelescopeTest {

	private static final String SAUCE = "sauce";
	private static final String MEAT = "meat";
	private static final String BREAD = "bread";
	private Telescope underTest;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test_OneArg_Successful() {
		// Setup
		Telescope target = new Telescope(BREAD);

		// Execution

		// Verification
		Assert.assertEquals(BREAD, target.getBread());
		Assert.assertEquals(null, target.getMeat());
		Assert.assertEquals(null, target.getSauce());
	}

	@Test
	public void test_TwoArgs_Successful() {
		// Setup
		Telescope target = new Telescope(BREAD, MEAT);

		// Execution

		// Verification
		Assert.assertEquals(BREAD, target.getBread());
		Assert.assertEquals(MEAT, target.getMeat());
		Assert.assertEquals(null, target.getSauce());
	}

	@Test
	public void test_ThreeArgs_Successful() {
		// Setup
		Telescope target = new Telescope(BREAD, MEAT, SAUCE);

		// Execution

		// Verification
		Assert.assertEquals(BREAD, target.getBread());
		Assert.assertEquals(MEAT, target.getMeat());
		Assert.assertEquals(SAUCE, target.getSauce());
	}

}
