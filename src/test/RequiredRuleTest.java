package test;

import main.com.shady.grammar.baserules.RequiredRule;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RequiredRuleTest {
    @Test
    public void testRule() {
        RequiredRule rule = new RequiredRule();

        String validSentence = "is required";
        assertTrue(rule.interpret(validSentence));

        String invalidSentence = "is not required";
        assertFalse(rule.interpret(invalidSentence));
    }
}
