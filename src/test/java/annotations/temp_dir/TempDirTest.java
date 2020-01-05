package annotations.temp_dir;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

// Test method creates and writes a file called numbers.txt in the temporary directory tempDir.
public class TempDirTest {

	@Test
	void givenTestMethodWithTempDirectory_whenWriteToFile_thenContentIsCorrect(@TempDir Path tempDir) throws IOException {
		
		Path file = tempDir.resolve("numbers.txt");

		List<String> lines = Arrays.asList("1", "2", "3");
		Files.write(file, lines);

		assertAll(
			() -> assertTrue(Files.exists(file)),
			() -> assertLinesMatch(lines, Files.readAllLines(file))
		);

	}

}
