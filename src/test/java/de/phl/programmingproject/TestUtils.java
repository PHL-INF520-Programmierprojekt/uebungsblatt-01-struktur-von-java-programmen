package de.phl.programmingproject;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Utility class for tests.
 */
public class TestUtils {
    /**
     * Returns true if the given file exists in the root directory or in the src directory.
     * @param fileName
     * @return true if the given file exists in the root directory or in the src directory.
     */
    public static boolean fileExistsInRootOrSrcDirectory(String fileName) {
        String workingDir = System.getProperty("user.dir");
        return Files.exists(Paths.get(workingDir, fileName)) ||
                Files.exists(Paths.get(workingDir, "./src/"+fileName));
    }
    
    /**
     * Executes the given action and returns the output that was printed to the system out.
     *
     * @param actionThatPrintsToSystemOut
     * @return
     */
    public static String runActionAndGetSystemOut(Runnable actionThatPrintsToSystemOut) {
        // Save the original System.out
        PrintStream originalOut = System.out;

        // Create a stream to hold the output
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream newOut = new PrintStream(baos);

        // Set the new stream as the standard out
        System.setOut(newOut);

        // Call the action that prints to the system out
        actionThatPrintsToSystemOut.run();

        // Reset the standard out
        System.setOut(originalOut);

        String output = baos.toString();
        return output;
    }

}
