/**
 * 
 */
package com.giobertox.pattern.creational;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.giobertox.pattern.creational.ClassWithBuilder.Builder;

/**
 * @author giovanni
 *
 */
public class ClassWithBuilderTest {

	private static final String SAUCE = "sauce";
	private static final String MEAT = "meat";
	private static final String BREAD = "bread";

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test_basicConstructor_success() {
		// Setup
		ClassWithBuilder target = new ClassWithBuilder.Builder(BREAD).build();

		// Execute

		// Verification
		Assert.assertEquals(BREAD, target.getBread());
		Assert.assertEquals(null, target.getMeat());
		Assert.assertEquals(null, target.getSauce());
	}

	@Test
	public void test_allFieldConstructor_success() {
		// Setup
		ClassWithBuilder target;
		Builder builder = new ClassWithBuilder.Builder(BREAD).meat(MEAT).sauce(SAUCE);
		target = builder.build();

		// Execute

		// Verification
		Assert.assertEquals(BREAD, target.getBread());
		Assert.assertEquals(MEAT, target.getMeat());
		Assert.assertEquals(SAUCE, target.getSauce());
	}

}
