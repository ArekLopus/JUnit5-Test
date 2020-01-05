package running_programmatically;

import java.io.PrintWriter;

import org.junit.platform.engine.discovery.DiscoverySelectors;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.TestPlan;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

@SuppressWarnings("unused")
public class JUnit5TestRunPackage {
	
	SummaryGeneratingListener listener = new SummaryGeneratingListener();
	
	public void singleTest() {
		
		LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder
			.request()
			.selectors(DiscoverySelectors.selectPackage("running_from_java"))
		    .build();
		Launcher launcher = LauncherFactory.create();
		
		TestPlan testPlan = launcher.discover(request);
		launcher.registerTestExecutionListeners(listener);
		launcher.execute(request);
		
	}
	
	
	public static void main(String[] args) {
		
		JUnit5TestRunPackage runner = new JUnit5TestRunPackage();
	    runner.singleTest();
	 
	    TestExecutionSummary summary = runner.listener.getSummary();
	    summary.printTo(new PrintWriter(System.out));
	    
	}
}
