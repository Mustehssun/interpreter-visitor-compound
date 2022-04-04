package test;

import main.com.shady.grammar.baserules.PrefixRule;
import main.com.shady.grammar.baserules.SuffixRule;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SuffixRuleTest {
    @Test
    public void testRule() {
        SuffixRule rule = new SuffixRule();

        String validSentence = "ends with auto";
        assertTrue(rule.interpret(validSentence));

        String invalidSentence = "starts with auto";
        assertFalse(rule.interpret(invalidSentence));
    }
}
