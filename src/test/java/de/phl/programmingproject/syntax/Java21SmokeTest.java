package de.phl.programmingproject.syntax;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Java21SmokeTest {

    @Test
    void jdk21_collections_work() {
        List<Integer> nums = List.of(1, 2, 3);
        var rev = nums.reversed();          // Java 21 Feature
        assertEquals(3, rev.getFirst());    // Java 21 Feature
        assertEquals(1, rev.getLast());     // Java 21 Feature
    }

    @Test
    void jdk21_switch_pattern_matching_works() {
        Object o = "x";
        int length = switch (o) {           // Java 21 Feature
            case String s -> s.length();
            default -> -1;
        };
        assertEquals(1, length);
    }

    @Test
    void print_java_version() {
        System.out.println("Java version used for tests: " + System.getProperty("java.version"));
    }
}
