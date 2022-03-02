package com.revature;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * This is the test suite for the project, it runs all the unit and integration tests
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	AccountTests.class,
	UserTests.class,
	FileIntegrationTests.class,
	DatabaseIntegrationTests.class,
})
public class ProjectTestSuite {
	
	public static void main(String[] args) {
		JUnitCore core = new JUnitCore();
		core.addListener(new PointsListener());
		core.run(ProjectTestSuite.class);
	}
}
