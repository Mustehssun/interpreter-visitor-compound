package test;

import main.com.shady.grammar.baserules.PrefixRule;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrefixRuleTest {
    @Test
    public void testRule() {
        PrefixRule rule = new PrefixRule();

        String validSentence = "starts with auto";
        assertTrue(rule.interpret(validSentence));

        String invalidSentence = "starts with";
        assertFalse(rule.interpret(invalidSentence));
    }
}
