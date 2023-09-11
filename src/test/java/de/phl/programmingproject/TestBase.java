package de.phl.programmingproject;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Base class for tests.
 */
public class TestBase {

    protected ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    /**
     * The stream that is used to redirect the system out.
     */
    protected PrintStream outStream = new PrintStream(byteArrayOutputStream);

    PrintStream originalOut = System.out;

    /**
     * Redirects the system out to {@link TestBase#outStream a stream} that is not printed to the console.
     */
    public void redirectSystemOut(){
        // save the original System.out
        originalOut = System.out;
        System.setOut(outStream);
    }

    /**
     * Returns the content that was printed to the system out.
     * @return
     */
    public String getSystemOut(){
        return byteArrayOutputStream.toString();
    }

    /**
     * Resets the system out to the console.
     */
    public void resetSystemOut(){
        System.setOut(originalOut);
    }


    /**
     * Executes the given action and returns the output that was printed to the system out.
     * @param actionThatPrintsToSystemOut
     * @return
     */
    public static String runActionAndGetSystemOut(Runnable actionThatPrintsToSystemOut){
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
