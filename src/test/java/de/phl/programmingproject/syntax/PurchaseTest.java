package de.phl.programmingproject.syntax;


import de.phl.programmingproject.TestBase;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;


/***
 * Test for the Purchase class.
 */
public class PurchaseTest extends TestBase {

    private static final String SYNTAX_PACKAGE = "de.phl.programmingproject.syntax";
    @Test
    public void task_1_purchase_class_exists(){
        try {
            Class.forName(String.format("%s.Purchase", SYNTAX_PACKAGE));
        } catch (ClassNotFoundException e) {
            System.err.println(e);
            fail(String.format("The 'Purchase' class does not exist in the '%s' package.", SYNTAX_PACKAGE));
        }
    }

    @Test void task_2_purchase_class_has_main_method(){
        try {
            Class.forName(String.format("%s.Purchase", SYNTAX_PACKAGE)).getMethod("main", String[].class);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            System.err.println(e);
            fail("The 'Purchase' class does not exist or does not have a main method.");
        }
    }

    @Test
    public void task_8_main_method_prints_total_cost() {

        Method mainMethod = null;
        try {
            mainMethod = Class.forName(String.format("%s.Purchase", SYNTAX_PACKAGE)).getMethod("main", String[].class);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            System.err.println(e);
            fail("The 'Purchase' class does not exist or it does not have a main method.");
        }

        this.redirectSystemOut();

        // Print from the main method
        try {
            // call main method via reflection
            mainMethod.invoke(null, (Object) new String[]{});
        } catch (IllegalAccessException  |InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        String output = getSystemOut();
        this.resetSystemOut();

        assertTrue(output.toLowerCase().contains("total cost") || output.toLowerCase().contains("gesamtkosten"),
                "The output of the main method does not contain the total cost.");
    }
}
