package com.revature;

import org.junit.AssumptionViolatedException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.mockito.MockitoAnnotations;

public class PointWatcher {
	
	@Before
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}
	
	public static int totPoints = 0;
	public static int totPointsEarned = 0;
	public static int totPointsFailed = 0;
	public static int totPointsSkipped = 0;

	@Rule
	public final TestRule pointWatchman = new TestWatcher() {
		
		@Override
		protected void starting(Description description) {
			Points pts = description.getAnnotation(Points.class);
	    	if (pts != null) {
	    		totPoints += pts.value();
	    	}
			super.starting(description);
		}

	    @Override
	    protected void succeeded(Description description) {
	    	Points pts = description.getAnnotation(Points.class);
	    	if (pts != null) {
	    		totPointsEarned += pts.value();
	    	}
	    }

	    @Override
	    protected void failed(Throwable e, Description description) {
	    	Points pts = description.getAnnotation(Points.class);
	    	if (pts != null) {
	    		totPointsFailed += pts.value();
	    	}
	    }

	    @Override
	    protected void skipped(AssumptionViolatedException e, Description description) {
	    	Points pts = description.getAnnotation(Points.class);
	    	if (pts != null) {
	    		totPointsSkipped += pts.value();
	    	}
	    	System.err.println(e);
	    }

	    @Override
	    protected void finished(Description description) {
	      if (description.getAnnotation(Points.class) == null) {
	    	  System.err.println(description.getMethodName() + " is missing @Points annotation");
	      }
	      super.finished(description);
	    }
	};
}
