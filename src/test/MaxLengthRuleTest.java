package test;

import main.com.shady.grammar.baserules.MaxLengthRule;
import main.com.shady.grammar.baserules.MinLengthRule;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MaxLengthRuleTest {
    @Test
    public void testRule() {
        MaxLengthRule rule = new MaxLengthRule();

        String validSentence = "has maximum length of 8";
        assertTrue(rule.interpret(validSentence));

        String invalidSentence = "has max length of 8";
        assertFalse(rule.interpret(invalidSentence));
    }
}
