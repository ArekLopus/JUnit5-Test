package running_programmatically;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

public class JUnit4TestRun {

	public static void main(String[] args) {
		
		JUnitCore junit = new JUnitCore();
		junit.addListener(new TextListener(System.out));
		junit.run(JUnit4Tests.class);
		
	}
	
}
