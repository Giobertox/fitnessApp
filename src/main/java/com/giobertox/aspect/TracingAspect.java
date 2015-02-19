package com.giobertox.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TracingAspect {

	Logger logger = Logger.getLogger(this.getClass());

	boolean enteringCalled = false;

	@Pointcut("execution(public void methodName(javax.portlet.PortletRequest.PortletRequest)")
	private void verySpecificMethods() {
	}

	@Pointcut("execution(* * *(..)")
	private void anyOperation() {
	}

	@Pointcut("execution(public * *(..)")
	private void anyPublicOperation() {
	}

	// --------------- Pointcuts ----------------------
	@Before("execution(public * *(..)")
	// ("execution( public List<Activity> findAllActivities())")
	public void logEntering() {
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
