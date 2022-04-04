package test;

import main.com.shady.grammar.FilterRule;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FilterRuleTest {
    @Test
    public void testRule() {
        FilterRule rule = new FilterRule();

        String validSentence = "is required and starts with auto and ends with bots and has minimum length of 2 and " +
                "has maximum length of 8";
        assertTrue(rule.interpret(validSentence));

        String invalidSentence = "is req and starts with auto and ends with bots and has minimum length of 2 and " +
                "has maximum length of 8";
        assertFalse(rule.interpret(invalidSentence));
    }
}
