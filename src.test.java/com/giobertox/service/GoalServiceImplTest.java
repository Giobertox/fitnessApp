/**
 * 
 */
package com.giobertox.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import com.giobertox.model.Goal;
import com.giobertox.repository.GoalRepository;
import com.giobertox.service.GoalServiceImpl;

/**
 * @author giovanni
 *
 */
public class GoalServiceImplTest {

	private @Mock GoalRepository mockGoalRepository;

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
		MockitoAnnotations.initMocks(this);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_findAllGoals_success() {
		// Setup
		GoalServiceImpl target = new GoalServiceImpl();
		target.setGoalRepository(mockGoalRepository);

		Goal goal = new Goal();
		List<Goal> goalList = new ArrayList<Goal>();
		goalList.add(goal);

		Mockito.when(mockGoalRepository.loadAll()).thenReturn(goalList);
		// Execution
		List<Goal> result = target.findAllGoals();

		// Verification
		Mockito.verify(mockGoalRepository, Mockito.times(1)).loadAll();

		Assert.notNull(result);
		Assert.notEmpty(result);
		Assert.isTrue((result != null), "The result must not be null");
		Assert.isTrue((!CollectionUtils.isEmpty(result)), "The result must not be empty");
		Assert.isTrue((result.size() == 1), "The result should have one only element");
		Assert.isTrue(result.equals(goalList),
				"The result  should be the same set in the mocked object");
	}
}
