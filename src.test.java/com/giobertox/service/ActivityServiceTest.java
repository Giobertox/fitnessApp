package com.giobertox.service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.util.Assert;

import com.giobertox.model.Activity;
import com.giobertox.repository.ActivitiesRepository;

public class ActivityServiceTest {

	private ActivitiesRepository mockedActivitiesRepository;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		mockedActivitiesRepository = Mockito.mock(ActivitiesRepository.class);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_getActivity_success() {
		// Setup
		ActivityServiceImpl target = new ActivityServiceImpl();
		target.setActivitiesRepository(mockedActivitiesRepository);

		Long activityId = 1L;
		Activity activity1 = new Activity(activityId, "description");
		Mockito.when(mockedActivitiesRepository.getActivity(Mockito.anyLong())).thenReturn(
				activity1);

		// Execution
		Activity result = target.getActivity(activityId);
		// Verification
		Mockito.verify(mockedActivitiesRepository, Mockito.times(1)).getActivity(Mockito.anyLong());

		Assert.notNull(result, "result should not be null");
		Assert.isTrue((result.equals(activity1)),
				"result should be the same as the one set up in the test");
	}
}
