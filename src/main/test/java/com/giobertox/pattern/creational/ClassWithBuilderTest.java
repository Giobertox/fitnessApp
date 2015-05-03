/**
 * 
 */
package com.giobertox.pattern.creational;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author giovanni
 *
 */
public class ClassWithBuilderTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test_basicConstructor_success() {
		// Setup
		ClassWithBuilder target = new ClassWithBuilder.Builder("bread").build();

		// Execute

		// Verification
		Assert.assertEquals("bread", target.getBread());
	}

}
