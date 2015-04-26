package com.giobertox.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TracingAspect {

	Logger logger = Logger.getLogger(this.getClass());

	boolean enteringCalled = false;

	// --------------- Pointcuts ----------------------

	@Pointcut("execution( * *(..))")
	private void anyOperation() {
	}

	@Pointcut("execution( String updateGoal(..))")
	private void anyUpdateGoal() {
	}

	// --------------- Advice ----------------------
	@Before("anyUpdateGoal()")
	// ("execution( public List<Activity> findAllActivities())")
	public void logEntering(JoinPoint joinPoint) {
		// enteringCalled = true;
		logger.trace("entering ");// +
		// // joinPoint.getStaticPart().getSignature().toString());
	}

	public boolean isEnteringCalled() {
		return enteringCalled;
	}

	public void setEnteringCalled(boolean enteringCalled) {
		this.enteringCalled = enteringCalled;
	}

}
