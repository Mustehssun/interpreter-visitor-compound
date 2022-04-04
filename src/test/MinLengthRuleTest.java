package test;

import main.com.shady.grammar.baserules.MinLengthRule;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MinLengthRuleTest {
    @Test
    public void testRule() {
        MinLengthRule rule = new MinLengthRule();

        String validSentence = "has minimum length of 8";
        assertTrue(rule.interpret(validSentence));

        String invalidSentence = "has min length of 8";
        assertFalse(rule.interpret(invalidSentence));
    }
}
