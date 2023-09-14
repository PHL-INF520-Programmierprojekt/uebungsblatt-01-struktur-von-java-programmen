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
    public void redirectSystemOut() {
        // save the original System.out
        originalOut = System.out;
        System.setOut(outStream);
    }

    /**
     * Returns the content that was printed to the system out.
     *
     * @return
     */
    public String getSystemOut() {
        return byteArrayOutputStream.toString();
    }

    /**
     * Resets the system out to the console.
     */
    public void resetSystemOut() {
        System.setOut(originalOut);
    }
}
