package de.phl.programmingproject.banking;

import de.phl.programmingproject.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankingTest {

    @Test
    void banking_markdown_file_exists_in_root_directory() {
        // check that the file 'banking.md' exists in the root directory of the project
        // (i.e. in the root or  'src' directory)
        assertTrue(TestUtils.fileExistsInRootOrSrcDirectory("banking.md"), "The file 'banking.md' does not exist in the root (or './src') directory of the project.");
    }
}
