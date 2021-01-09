package org.testunit;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


//@RunWith(Suite.class)
//@SuiteClasses({ClassA.class,ClassB.class})
public class RunnerClass {
	@Test
	public void test1() {
		Result ss = JUnitCore.runClasses(ClassA.class,ClassB.class);
		int j = ss.getFailureCount();
		System.out.println(j);
		int i = ss.getRunCount();
		System.out.println(i);
		int k = ss.getIgnoreCount();
		System.out.println(k);
		long l = ss.getRunTime();
		System.out.println(l);
		List<Failure> failures = ss.getFailures();
		for (Failure failure : failures) {
			
			System.out.println(failure);
		}
	
	}

}
