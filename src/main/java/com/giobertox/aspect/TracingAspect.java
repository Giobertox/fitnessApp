package com.giobertox.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TracingAspect {

	Logger logger = Logger.getLogger(this.getClass());

	boolean enteringCalled = false;

	@Pointcut("execution(* * *(..)")
	private void anyOperation() {
	}

	@Pointcut("execution(public * *(..)")
	private void anyPublicOperation() {
	}

	@Before("execution(* *(..)")
	public void logEntering(JoinPoint joinPoint) {
		enteringCalled = true;
		logger.trace("entering " + joinPoint.getStaticPart().getSignature().toString());
	}

	public boolean isEnteringCalled() {
		return enteringCalled;
	}

	public void setEnteringCalled(boolean enteringCalled) {
		this.enteringCalled = enteringCalled;
	}

}
