package annotations.timeout;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TimeoutTest {
	
	// java.util.concurrent.TimeoutException: setUp() timed out after 1 second
	@BeforeEach
    @Timeout(1)
    void setUp() throws InterruptedException {
        int ms = ThreadLocalRandom.current().nextInt(2000);
        Thread.sleep(ms);
    }
	
	// java.util.concurrent.TimeoutException: failsIfExecutionTimeExceeds100Milliseconds() timed out after 100 milliseconds
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void failsIfExecutionTimeExceeds100Milliseconds() throws InterruptedException {
    	int ms = ThreadLocalRandom.current().nextInt(200);
        Thread.sleep(ms);
    }
	
}
