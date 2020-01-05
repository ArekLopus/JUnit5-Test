package annotations.temp_dir;

import static org.junit.jupiter.api.Assertions.assertLinesMatch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

public class SharedTempDirectoryDemo {

    @TempDir
    static Path sharedTempDir;

    @Test
    void writeNumbersToFile() throws IOException {
        
    	Path file = sharedTempDir.resolve("test.txt");

        List<String> lines = Arrays.asList("1", "2", "3");
        Files.write(file, lines);
        
        assertLinesMatch(lines, Files.readAllLines(file));
    }
    
    @Test
    void writeLettersToFile() throws IOException {
    	
    	Path file = sharedTempDir.resolve("letters.txt");

        List<String> lines = Arrays.asList("a", "b", "c");
        Files.write(file, lines);
        
        assertLinesMatch(lines, Files.readAllLines(file));
    }
    
}