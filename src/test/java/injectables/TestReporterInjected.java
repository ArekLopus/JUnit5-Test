package injectables;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

// TestReporter - used to print test information to stout or stderr.
public class TestReporterInjected {
	
	@Test
	public void test(TestReporter tr) {
		
		tr.publishEntry("EntryValue");
		tr.publishEntry("EntryKey", "EntryValue");
		
		Map<String, String> map = new HashMap<>();
		map.put("MapEntryKey1", "MapEntryValue1");
		map.put("MapEntryKey2", "MapEntryValue2");
		tr.publishEntry(map);
		
	}
	
}
